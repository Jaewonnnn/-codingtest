class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double buf = 0;
        for(int i = 0; i<arr.length; i++){
            buf += arr[i];
        }
        answer = buf / arr.length;
        return answer;
    }
}