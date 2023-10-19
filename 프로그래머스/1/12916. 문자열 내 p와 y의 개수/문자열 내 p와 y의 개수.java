class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        String temp = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            char c = temp.charAt(i);
            if(c == 'p') pCount++;
            else if (c == 'y') yCount++;
        }
        if(pCount != yCount) answer = false;

        return answer;
    }
}