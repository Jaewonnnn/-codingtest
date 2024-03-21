class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < answer.length; i++){
            answer[i] = "";
        }
        for(int i = 0; i < arr1.length; i++){
            String arr1String = Integer.toBinaryString(arr1[i]);
            String arr2String = Integer.toBinaryString(arr2[i]);
            
            while(arr1String.length() < n){
                arr1String = "0" + arr1String;
            }
            while(arr2String.length() < n){
                arr2String = "0" + arr2String;
            }
            for(int j = 0; j < arr1String.length(); j++){
                if(arr1String.charAt(j) == '1' || arr2String.charAt(j) == '1')
                    answer[i] += "#";
                else
                    answer[i] += " ";
            }
        }
        return answer;
    }
}