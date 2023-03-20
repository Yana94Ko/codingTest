import java.util.Arrays;

class Solution {
    public int solution(int n) {
        // //1. 기본 풀이
        // int answer = n % 10;
        // while(n / 10 != 0){
        //     n /= 10;
        //     answer += n % 10;
        // }
        // return answer;
        
        //2. Stream 활용 풀이
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }
}