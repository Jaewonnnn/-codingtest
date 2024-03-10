import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        List<String> cd1 = new ArrayList<>(Arrays.asList(cards1));
        List<String> cd2 = new ArrayList<>(Arrays.asList(cards2));
        
        boolean flag = true;
        int i = 0;

        while(i < goal.length){
            if(!cd1.isEmpty() && goal[i].equals(cd1.get(0))){
                cd1.remove(0);
                i++;
            }
            else if(!cd2.isEmpty() && goal[i].equals(cd2.get(0))){
                cd2.remove(0);
                i++;
            }
            else {
                answer = "No";
                break;
            }
        }
        return answer;
    }
}
