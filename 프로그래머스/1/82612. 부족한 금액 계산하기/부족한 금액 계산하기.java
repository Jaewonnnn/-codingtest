class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long num = price;
        for(int i = 0; i < count; i++){
            answer += num;
            num += price;
        }
        if(answer - money >= 0)
            answer -= money;
        else answer = 0;
        return answer;
    }
}