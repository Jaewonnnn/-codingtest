import java.util.*;
class Solution {
    public long solution(long n) {
        String num = Long.toString(n);
        int[] arr = new int[num.length()];
        
        for(int i = 0; i<num.length(); i++){
            arr[i] = Integer.parseInt(Character.toString(num.charAt(i)));
        }
        
        Arrays.sort(arr);
        num = "";
        
        for(int i = arr.length - 1; i >= 0; i--){
            num += arr[i];
        }
        return Long.parseLong(num);
    }
}