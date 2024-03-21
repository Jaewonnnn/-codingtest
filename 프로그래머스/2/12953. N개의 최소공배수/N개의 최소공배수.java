import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int count = 0;
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        while(true){
            for(int i = 0; i < arr.length - 1; i++){
                if(arr[arr.length-1] % arr[i] != 0){
                    arr[arr.length-1] += max;
                    count = 0;
                    break;
                }else
                    count++;
            }
            if(count == arr.length - 1){
                return arr[arr.length-1];       
            }
        }
    }
}