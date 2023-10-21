import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isDigit(c)) 
                arr.add(Integer.parseInt(Character.toString(c)));
        }
        int[] answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
