class Solution {
    public String solution(String s, int n) {
        String answer = "";
    
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == ' ') {
                answer += ' ';
            }
            else if(Character.isLowerCase(s.charAt(i))){
                if(s.charAt(i) + n > 'z'){
                    answer += Character.toString(s.charAt(i) + n - 26);
                }
                else
                    answer += Character.toString(s.charAt(i) + n);
            }
            else if(Character.isUpperCase(s.charAt(i))){
                if(s.charAt(i) + n > 'Z'){
                    answer += Character.toString(s.charAt(i) + n - 26);
                }
                else
                    answer += Character.toString(s.charAt(i) + n);
            }
            
        }
        return answer;
    }
}