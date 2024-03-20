import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){            
            char buf = s.charAt(i);
            for(int j = 0; j < index; j++){
                buf += 1;
                if(buf > 'z'){
                    buf -= 26;
                }
                if(skip.contains(Character.toString(buf))){
                    j--;
                }
            }
            answer += buf;
        }
        return answer;
    }
}