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
        
        System.out.printf("first %d %d\n", answer[0], answer[1]);
        
        for(int i = 0; i < routes.length; i++){
            int num = Integer.parseInt(Character.toString(routes[i].charAt(2)));
            System.out.printf("\n%d번째 이동 num = %d 현재위치 = %d %d\n", i+1, num, answer[0], answer[1]);
            switch(routes[i].charAt(0)){
                case 'E':
                    if(answer[1] + num >= park[0].length()){
                        System.out.println("East overflow");
                        continue;
                    }
                    else{
                        boolean flag = false;
                        for(int j = answer[1]; j < answer[1] + num; j++){
                            if(park[answer[0]].charAt(j+1) == 'X'){
                                System.out.printf("East find X");
                                flag = true;
                                break;
                            }
                        }
                        if(flag)
                            continue;
                        answer[1] += num;
                        System.out.printf("East move %d %d\n", answer[0], answer[1]);
                        continue;
                    }
                case 'W':
                    if(answer[1] - num <= -1){
                        System.out.println("West overflow");
                        continue;
                    }
                    else{
                        boolean flag = false;
                        for(int j = answer[1]; j > answer[1] - num; j--){
                            if(park[answer[0]].charAt(j-1) == 'X'){
                                System.out.printf("west find X");
                                flag = true;
                                break;
                            }
                        }
                        if(flag)
                            continue;
                        answer[1] -= num;
                        System.out.printf("\nWest move %d %d\n", answer[0], answer[1]);
                        continue;
                    }
                case 'N':
                    if(answer[0] - num < 0){
                        System.out.println("North overflow");
                        continue;
                    }
                    else{
                        boolean flag = false;
                        for(int j = answer[0]; j > answer[0] - num; j--){
                            if(park[j-1].charAt(answer[1]) == 'X'){
                                System.out.printf("north find X\n");
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
                        System.out.println("South overflow");
                        continue;
                    }
                    else{
                        boolean flag = false;
                        for(int j = answer[0]; j < answer[0] + num; j++){
                            if(park[j+1].charAt(answer[1]) == 'X'){
                                flag = true;
                                System.out.printf("south find X\n");
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
                               
