import java.util.*;
class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for(int i = food.length-1; i >= 0; i--){
            if(food[i] % 2 == 0){
                for(int j = 0; j < food[i] / 2; j++){
                    sb.insert(0, i);
                    sb.insert(sb.length(), i);
                }
            }
            else if(food[i] % 2 == 1){
                for(int j = 0; j < (food[i] - 1) / 2; j++){
                    sb.insert(0, i);
                    sb.insert(sb.length(), i);
                }
            }
        }
        return sb.insert((sb.length()/2), "0").toString();
    }
}