import java.util.*;
class Solution {
    public List<Integer> solution(int[] numbers) {
        List<Integer> answer = new ArrayList<>();
        // Arrays.sort(numbers);
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                int num = numbers[i] + numbers[j];
                if(!answer.contains(num)){
                    answer.add(num);
                }
            }
        }
        Collections.sort(answer);
        return answer;
    }
}