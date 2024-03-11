import java.util.*;
class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for(int number : nums){
            set.add(number);
        }
        
        return (nums.length / 2 <= set.size()) ? nums.length / 2 : set.size();
    }
}