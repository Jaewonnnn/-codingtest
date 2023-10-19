import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String buf = Long.toString(n);
        char[] temp = new char[buf.length()];
        for(int i = 0; i < buf.length(); i++){
            char c = buf.charAt(i);
            temp[i] = c;
        }
        Arrays.sort(temp);
        buf = "";
        for(int i = temp.length - 1; i >= 0; i--){
           buf += temp[i];
        }
        return Long.parseLong(buf);
    }
}