class Solution {
    public int solution(int n) {
        int answer = 0;
        int min = Integer.MIN_VALUE;
        for(int i = 1; i <= n; i++){
            if(n % i == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }
}