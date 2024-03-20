class Solution {
    public int solution(int n) {
        int answer = 0;
        int nCount = countOne(n);
        int m = n + 1;
        while(true){
            if(nCount == countOne(m)){
                return m;
            }
            m++;
        }
    }
    public int countOne(int num){
        int count = 0;
        String binary = Integer.toBinaryString(num);
        for(int i = 0; i < binary.length(); i++){
            if(binary.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
}