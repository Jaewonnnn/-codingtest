import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i<players.length; i++){
            map.put(players[i], i);
        }
        
        for(int i = 0; i < callings.length; i++){
            int rank = map.get(callings[i]);
            
            String front = players[rank - 1];
            String back = players[rank];
            
            players[rank-1] = back;
            map.put(back, rank - 1);
            
            players[rank] = front;
            map.put(front, rank);
        }
        return players;
    }
}