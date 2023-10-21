class Solution {
    public int solution(int a, int b) {
        int answer = 2 * a * b;
        String ab = Integer.toString(a) + Integer.toString(b);
        if(Integer.parseInt(ab) > 2 * a * b)
            answer = Integer.parseInt(ab);
        return answer;
    }
}