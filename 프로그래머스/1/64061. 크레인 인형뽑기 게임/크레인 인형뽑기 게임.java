import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> box = new ArrayList<>();
        for(int i = 0; i < moves.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[j][moves[i]-1] != 0){
                    if(!box.isEmpty() && box.get(box.size()-1) == board[j][moves[i]-1]){
                        box.remove(box.size()-1);
                        answer += 2;
                    }
                    else{
                        box.add(board[j][moves[i]-1]);
                    }
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}