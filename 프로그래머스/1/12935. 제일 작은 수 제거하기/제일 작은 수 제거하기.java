import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int min = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        
        if(arr.length <= 1){
            int[] emptyArr = {-1};
            return emptyArr;
        }
        else{
            for(int i = 0; i<arr.length; i++){
                if(min > arr[i]) min = arr[i];
            }
            for(int i = 0; i < arr.length; i++){
                if(arr[i] != min)
                    list.add(arr[i]);
            }
        }
        for(int i = 0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}