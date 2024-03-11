class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String temp = "";
        for(int i = 0; i < strings.length; i++){
            for(int j = i+1; j <= strings.length-1; j++){
                if(strings[i].charAt(n) > strings[j].charAt(n)){
                    temp = strings[j];
                    strings[j] = strings[i];
                    strings[i] = temp;
                }
                else if(strings[i].charAt(n) == strings[j].charAt(n)){
                    if(strings[i].compareTo(strings[j]) >= 1){
                    temp = strings[j];
                    strings[j] = strings[i];
                    strings[i] = temp;
                }
                }
            }
        }
        return strings;
    }
}