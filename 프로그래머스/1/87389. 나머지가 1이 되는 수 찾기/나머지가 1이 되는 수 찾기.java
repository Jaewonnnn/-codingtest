class Solution {
    public int solution(int n) {
        int answer = 1;
        
        while(n > 1){
            if(n % answer == 1) break;
            answer++;
        }
        return answer;
    }
}