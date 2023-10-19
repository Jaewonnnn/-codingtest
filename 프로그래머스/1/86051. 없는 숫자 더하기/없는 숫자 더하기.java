class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] buf = new int[10];
        for(int i = 0; i < numbers.length; i++){
            buf[numbers[i]]++;
        }
        for(int i = 0; i<buf.length; i++){
            if(buf[i] == 0){
                answer += i;
            }
        }
        return answer;
    }
}