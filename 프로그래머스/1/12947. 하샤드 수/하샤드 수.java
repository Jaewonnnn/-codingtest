class Solution {
    public boolean solution(int x) {
        String str = Integer.toString(x);
        char[] buf = new char[str.length()];
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            buf[i] = c;
        }
        for(int i = 0; i< buf.length; i++){
            sum += buf[i] - '0';
        }
        System.out.println(sum);
        if (x % sum == 0) return true;
        else return false;
    }
}