class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int[][] x = new int[park.length][park[0].length()];
        
        for(int i = 0; i < park.length; i++){
            for(int j = 0; j < park[i].length(); j++){
                if(park[i].charAt(j) == 'S'){
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        
        for(int i = 0; i < routes.length; i++){
            int num = Integer.parseInt(Character.toString(routes[i].charAt(2)));
            switch(routes[i].charAt(0)){
                case 'E':
                    if(answer[1] + num >= park[0].length()){
                        continue;
                    }
                    else{
                        boolean flag = false;
                        for(int j = answer[1]; j < answer[1] + num; j++){
                            if(park[answer[0]].charAt(j+1) == 'X'){
                                flag = true;
                                break;
                            }
                        }
                        if(flag)
                            continue;
                        answer[1] += num;
                        continue;
                    }
                case 'W':
                    if(answer[1] - num <= -1){
                        continue;
                    }
                    else{
                        boolean flag = false;
                        for(int j = answer[1]; j > answer[1] - num; j--){
                            if(park[answer[0]].charAt(j-1) == 'X'){
                                flag = true;
                                break;
                            }
                        }
                        if(flag)
                            continue;
                        answer[1] -= num;
                        continue;
                    }
                case 'N':
                    if(answer[0] - num < 0){
                        continue;
                    }
                    else{
                        boolean flag = false;
                        for(int j = answer[0]; j > answer[0] - num; j--){
                            if(park[j-1].charAt(answer[1]) == 'X'){
                                flag = true;
                                break;
                            }
                        }
                        if(flag)
                            continue;
                        answer[0] -= num;
                        continue;
                    }
                case 'S':
                    if(answer[0] + num >= park.length){
                        continue;
                    }
                    else{
                        boolean flag = false;
                        for(int j = answer[0]; j < answer[0] + num; j++){
                            if(park[j+1].charAt(answer[1]) == 'X'){
                                flag = true;
                            }
                        }
                        if (flag){
                            continue;
                        }
                        else{
                            answer[0] += num;
                        }
                    }
            }
        }
        return answer;
    }
}