import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = new String[s.length()];
        for(int i = 0; i<arr.length; i++){
            arr[i] = Character.toString(s.charAt(i));
        }
        Arrays.sort(arr);
        for(int i = arr.length -1; i >= 0; i--){
            answer += (arr[i]);
        }
        return answer;
    }
}