class Solution {
    public int solution(int n) {
        String buf = "";
        while (n >= 3) {
            buf += Integer.toString(n % 3);
            n /= 3;
        }
        buf += Integer.toString(n);
        
        return Integer.parseInt(buf, 3);
    }
}
