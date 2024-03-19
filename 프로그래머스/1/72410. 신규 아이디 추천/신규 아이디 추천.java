import java.util.*;
class Solution {
    public String solution(String new_id) {
        String answer = "";
        StringBuffer sb = new StringBuffer(new_id.toLowerCase());
        System.out.printf("1단계 : %s\n", sb);
        
        for(int i = 0; i < sb.length(); i++){
            char alp = sb.charAt(i);
            if(!Character.isLetter(alp) && !Character.isDigit(alp) && alp != '-' && alp != '_' && alp != '.'){
                sb.deleteCharAt(i--);
            }
        }
        
        System.out.printf("2단계 : %s\n", sb);
        for(int i = 0; i < sb.length()-1; i++){
            char fir = sb.charAt(i);
            char sec = sb.charAt(i+1);
            if(fir == '.' && sec == '.'){
                sb.deleteCharAt(i--);
            }
        }
        System.out.printf("3단계 : %s\n", sb);
        
        if(sb.length() > 0 && sb.charAt(0)=='.'){
            sb.deleteCharAt(0);
        }
        if(sb.length() > 0 && sb.charAt(sb.length()-1)=='.'){
            sb.deleteCharAt(sb.length()-1);
        }
        System.out.printf("4단계 : %s\n", sb);
        
        if(sb.length() == 0){
            sb.append('a');
        }
        System.out.printf("5단계 : %s\n", sb);
        
        if(sb.length() >= 16){
            sb.setLength(15);
        }
        System.out.printf("6단계 : %s\n", sb);
        if(sb.length() > 0 && sb.charAt(sb.length()-1)=='.'){
            sb.deleteCharAt(sb.length()-1);
        }
        if(sb.length() <= 2){
            while(sb.length() < 3){
                sb.append(sb.charAt(sb.length()-1));
            }
        }
        System.out.printf("7단계 : %s\n", sb);
        return sb.toString();
    }
}