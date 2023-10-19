class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        for(int i = 1; i<s.length(); i++){
            char c = s.charAt(i);
            for(int j = i-1; j >= 0; j--){
                if(s.charAt(j) == c) {
                    answer[i] = i - j;
                    break;
                }
                else answer[i] = -1;
            }
        }
        return answer;
    }
}