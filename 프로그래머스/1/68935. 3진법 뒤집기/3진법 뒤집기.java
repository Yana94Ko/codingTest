import java.util.*;

class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        int result = 0,squareNumber = 0;
        
        while(n > 0){
            sb.append(n%3);
            n /= 3;
        }
        
        String thernaryNumber = sb.reverse().toString();
        while(sb.length()>0){
            result += Math.pow(3,squareNumber) * Integer.parseInt(Character.toString(sb.charAt(0)));
            sb.deleteCharAt(0);
            squareNumber+=1;
        }
        return result;
    }
    public int solution2(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(n,3));
        
        return Integer.parseInt(sb.reverse().toString(),3);
    }
}