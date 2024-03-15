class Solution {
    public String solution(String s) {
        String answer = "";
        String[] buf = s.split(" ");
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < buf.length; i++){
            int num = Integer.parseInt(buf[i]);
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        answer += Integer.toString(min) + " " + Integer.toString(max);
        return answer;
    }
}