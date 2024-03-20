class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int zeroCount = 0;
        int transCount = 0;
        while(!s.equals("1")){
            zeroCount += countZero(s);
            s = deleteZero(s);
            transCount++;
            if(s.equals("1")) break;
            s = transBinary(oneCount(s));
        }
        answer[0] = transCount;
        answer[1] = zeroCount;
        return answer;
    }
    public int countZero(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                count++;
            }
        }
        return count;
    }
    public String deleteZero(String s){
        return s.replaceAll("0", "");
    }
    public int oneCount(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
    public String transBinary(int num){
        String binary = "";
        while(num != 0){
            binary += Integer.toString(num % 2);
            num /= 2;
        }
        return binary;
    }
}