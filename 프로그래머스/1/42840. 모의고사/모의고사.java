import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int oneCount = 0;
        int twoCount = 0;
        int threeCount = 0;
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % one.length])
                oneCount++;
        }
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == two[i % two.length])
                twoCount++;
        }
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == three[i % three.length])
                threeCount++;
        }
        
        int maxCount = Math.max(oneCount, Math.max(twoCount, threeCount));
        
        List<Integer> answer = new ArrayList<>();
        
        if (oneCount == maxCount)
            answer.add(1);
        if (twoCount == maxCount)
            answer.add(2);
        if (threeCount == maxCount)
            answer.add(3);
        
        return answer;
    }
}
