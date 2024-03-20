import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        List<Integer> score = new ArrayList<>();
        int idx = -1;

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            if (Character.isDigit(c)) {
                idx++;
                if (c == '1' && dartResult.charAt(i + 1) == '0') {
                    score.add(10);
                    i++;
                } else {
                    score.add(Character.getNumericValue(c));
                }
            } else if (Character.isAlphabetic(c)) {
                int num = score.get(idx);
                if(c == 'S'){
                    continue;
                }
                else if (c == 'D') {
                    score.set(idx, (int) Math.pow(num, 2));
                } else if (c == 'T') {
                    score.set(idx, (int) Math.pow(num, 3));
                }
            } else if (c == '*' || c == '#') {
                if (c == '*') {
                    score.set(idx, score.get(idx) * 2);
                    if (idx > 0) {
                        score.set(idx - 1, score.get(idx - 1) * 2);
                    }
                } else if(c == '#'){
                    score.set(idx, score.get(idx) * -1);
                }
            }
        }
        for(int i = 0; i < score.size(); i++){
            answer += score.get(i);
        }
        return answer;
    }
}
