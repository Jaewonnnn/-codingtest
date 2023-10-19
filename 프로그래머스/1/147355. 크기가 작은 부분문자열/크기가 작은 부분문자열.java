class Solution {
    public Long solution(String t, String p) {
        Long answer = 0l;
        for(int i = 0; i < t.length() - p.length() + 1; i++){
            Long num = Long.parseLong(t.substring(i,i+p.length()));
            if(num <= Long.parseLong(p)) answer++;
        }
        return answer;
    }
}