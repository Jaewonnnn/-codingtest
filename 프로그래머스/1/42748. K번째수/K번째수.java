import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i<commands.length; i++){
            List<Integer> buf = new ArrayList<>();
            
            for(int j = commands[i][0] - 1; j <= commands[i][1] - 1; j++){
                buf.add(array[j]);
            }
            buf.sort(Comparator.naturalOrder());
            answer[i] = buf.get(commands[i][2] - 1);
        }
        
        return answer;
    }
}