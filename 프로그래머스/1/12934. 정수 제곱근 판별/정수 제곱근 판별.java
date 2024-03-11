class Solution {
    public long solution(long n) {
        long answer = 0;
        long buf = 0;
        for(long i = 1; i * i <= n; i++){
            if(i * i == n) buf = i;
        }
        if(buf == 0){
            return -1;
        }
        else
            return (buf + 1) * (buf + 1);
        
    }
}