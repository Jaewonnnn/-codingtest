import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 1;
        Map<Integer, Integer> map = new HashMap<>();
        int idx = 1;
        map.put(idx, nums[0]);
        for(int i = 0; i < nums.length; i++){
            if(answer == nums.length/2) break;
            
            if(map.containsValue(nums[i])){
                continue;
            }
            else{
                map.put(++idx, nums[i]);
                answer++;
            }
        }
        return answer;
    }
}