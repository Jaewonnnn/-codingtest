import java.util.*;
class Solution {
    public List<int[]> solution(int n) {
        List<int[]> answer = new ArrayList<>();
        hanoi(n, 1, 2, 3, answer);
        return answer;
    }
    public void hanoi(int n, int start, int temp, int end, List<int[]> answer){
        if(n == 1){
            answer.add(new int[]{start, end});
        }
        else{
            hanoi(n-1, start, end, temp, answer);
            answer.add(new int[]{start, end});
            hanoi(n-1, temp, start, end, answer);
        }
    }
}