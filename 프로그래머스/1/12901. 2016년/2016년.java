class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int day = b - 1;
        for(int i = 1; i < a; i++){
            day += month[i-1];
        }
        
        day %= 7;
        answer = week[day];
        return answer;
    }
}