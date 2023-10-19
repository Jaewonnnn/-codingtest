class Solution {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) {
            return new int[]{-1};
        } else {
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (min > arr[i]) 
                    min = arr[i];
            }
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != min)
                    count++;
            }
            int[] answer = new int[count];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != min)
                    answer[index++] = arr[i];
            }
            return answer;
        }
    }
}
