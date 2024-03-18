class Solution {
    public int solution(int n) {
        int answer = 1;
        
        for(int i = 1; i < n; i++){
            int sum = 0;
            int k = i;

            while(sum < n) {
                sum += k;
                k += 1;
            }
            if(sum == n) {
                answer += 1;    
            }
        }
        return answer;
    }
}