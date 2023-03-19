import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        // //1. for문을 이용한 기본 풀이
        // int [] answer = new int [numbers.length];
        // for(int i = 0; i < numbers.length; i++){
        //     answer[i] = numbers[i] * 2;
        // }
        // return answer;
        
        //2. Stream을 이용한 해법
        return Arrays.stream(numbers).map(i -> i * 2).toArray();
    }
}