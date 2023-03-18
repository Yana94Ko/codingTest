import java.util.Arrays;

class Solution {
    public int[] solution(String[] strlist) {
        // //1. for 문을 사용한 기본 풀이
        // int[] answer = new int [strlist.length];
        // for(int i = 0; i < strlist.length; i++){
        //     answer[i] = strlist[i].length();
        // }
        // return answer;
        
        //2. stream을 이용한 풀이
        return Arrays.stream(strlist).mapToInt(String :: length).toArray();
    }
}