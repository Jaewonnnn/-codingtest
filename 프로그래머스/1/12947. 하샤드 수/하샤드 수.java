class Solution {
    public boolean solution(int x) {
        int num = 0;
        int buf = x;
        
        while(buf > 0){
            num += buf % 10;
            buf /= 10;
        }
        return (x % num == 0) ? true : false;
    }
}