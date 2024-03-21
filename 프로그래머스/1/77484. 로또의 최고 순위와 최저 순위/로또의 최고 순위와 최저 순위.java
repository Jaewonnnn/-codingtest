import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int zeroCount = 0;
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        for(int i = 0; i < lottos.length; i++){
            if(lottos[i] == 0){
                zeroCount++;
                continue;
            }
            else{
                for(int j = 0; j < win_nums.length; j++){
                    if(lottos[i] == win_nums[j]){
                        count++;
                        break;
                    }
                }
            }
        }
        answer[0] = rank(count+zeroCount);
        answer[1] = rank(count);
        return answer;
    }
    public int rank(int num){
        switch(num){
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            case 1: return 6;
            case 0: return 6;
        }
        return 0;
    }
}