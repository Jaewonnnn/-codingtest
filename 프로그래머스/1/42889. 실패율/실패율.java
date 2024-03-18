import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] noClearCount = new int[N+1];
        int[] count = new int[N];
        double[] failRate = new double[N];
        Arrays.fill(count, stages.length);
        
        for(int i = 0; i < stages.length; i++){
            noClearCount[stages[i] - 1]++;
        }
        for(int i = 1; i <= N; i++){
            for(int j = 0; j < stages.length; j++){
                if(i > stages[j]){
                    count[i-1]--;
                }
            }
        }
        for(int i = 0; i < failRate.length; i++){
            if(count[i] != 0)
                failRate[i] = (double) noClearCount[i] / count[i];
        }
        for (int i = 0; i < N; i++) {
            int maxIndex = 0;
            double maxFailRate = -1;
            for (int j = 0; j < N; j++) {
                if (failRate[j] > maxFailRate) {
                    maxFailRate = failRate[j];
                    maxIndex = j;
                }
            }
            answer[i] = maxIndex + 1;
            failRate[maxIndex] = -1;
        }
        return answer;
    }
}