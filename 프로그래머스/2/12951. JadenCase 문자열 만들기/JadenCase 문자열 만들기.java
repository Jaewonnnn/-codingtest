class Solution {
    public String solution(String s) {
        String answer = "";
        String[] buf = s.toLowerCase().split(" ");
        
        for(int i = 0; i < buf.length; i++){
            
            if(buf[i].length() == 0){
                answer += " ";
            }
            else{
                char first = buf[i].charAt(0);
                if(Character.isDigit(first)){
                    answer += buf[i] + " ";
                }
                else if(Character.isLowerCase(first)){
                    answer += Character.toUpperCase(first) + buf[i].substring(1, buf[i].length()) + " ";
                }
            }
        }
        if(s.charAt(s.length()-1) == ' '){
            return answer;
        }
        else
            return answer.substring(0, answer.length()-1);
    }
}