import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        boolean flag = false;
        Arrays.sort(arr);
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % divisor == 0) {
                answer.add(arr[i]);
                flag = true;
            }
        }
        if(flag == false) answer.add(-1);
        return answer;
    }
}