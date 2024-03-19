class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int hight = 0;
        
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int buf = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = buf;
            }
        }
        for(int i = 0; i < sizes.length; i++){
            width = Math.max(width, sizes[i][0]);
            hight = Math.max(hight, sizes[i][1]);
        }
        return width * hight;
    }
}