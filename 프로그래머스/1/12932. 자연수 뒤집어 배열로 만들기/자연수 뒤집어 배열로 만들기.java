import java.util.*;
class Solution {
    public ArrayList<Integer> solution(long n) {
        ArrayList<Integer> answer = new ArrayList<>();
        String temp = Long.toString(n);
        for(int i = temp.length()-1; i >= 0; i--){
            char c = temp.charAt(i);
            answer.add(Integer.parseInt(Character.toString(c)));
        }
        return answer;
    }
}