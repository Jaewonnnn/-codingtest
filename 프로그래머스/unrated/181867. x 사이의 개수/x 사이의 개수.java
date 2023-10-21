import java.util.*;
class Solution {
    public List<Integer> solution(String myString) {
        List<Integer> answer = new ArrayList<>();
        int count = 0;
        for(int i = 0; i<myString.length(); i++){
            char c = myString.charAt(i);
            if(c != 'x') count++;
            else if(c == 'x'){
                answer.add(count);
                count = 0;
            }
        }
        answer.add(count);
        return answer;
    }
}