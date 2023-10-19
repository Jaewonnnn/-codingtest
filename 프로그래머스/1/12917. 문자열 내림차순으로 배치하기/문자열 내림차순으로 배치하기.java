import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        System.out.println(s.charAt(0) - '0');
        int[] arr = new int[s.length()];
        for(int i = 0; i<arr.length; i++){
            arr[i] = s.charAt(i) - '0';
        }
        Arrays.sort(arr);
        for(int i = arr.length -1; i >= 0; i--){
            answer += (char)(arr[i] + '0');
        }
        return answer;
    }
}