class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = GCD(Math.min(n, m), Math.max(n, m));
        answer[1] = LCM(Math.min(n, m), Math.max(n, m));
        return answer;
    }
    public int GCD(int a, int b){
        if(b == 0){
            return a;
        }
        else{
            return GCD(b, a%b);
        }
    }
    public int LCM(int a, int b){
        return (a*b) / GCD(a,b);
    }
}