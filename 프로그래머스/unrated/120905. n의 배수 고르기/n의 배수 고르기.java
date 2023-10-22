import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int n, int[] numlist) {
        ArrayList<Integer> answer = new ArrayList();
        int index = 0;
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                answer.add(numlist[i]);
            }
        }
        return answer;
    }
}