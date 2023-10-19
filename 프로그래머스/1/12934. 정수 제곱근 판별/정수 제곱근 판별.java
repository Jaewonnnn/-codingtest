class Solution {
    public long solution(long n) {
        long answer = -1;
        long i = 1;
        while(i * i <= n){
            if(i * i == n) 
                return (i + 1) * (i + 1);
            else 
                i++;
        }
        return answer;
    }
}