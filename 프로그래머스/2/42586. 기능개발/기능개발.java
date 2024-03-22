import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];
            int days = remain / speeds[i];
            if (remain % speeds[i] != 0) {
                days++;
            }
            queue.offer(days);
        }
        
        List<Integer> answerList = new ArrayList<>();
        
        while (!queue.isEmpty()) {
            int cnt = 1;
            int cur = queue.poll();
            
            while (!queue.isEmpty() && cur >= queue.peek()) {
                queue.poll();
                cnt++;
            }
            answerList.add(cnt);
        }
        
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}
