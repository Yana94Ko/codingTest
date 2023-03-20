import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // //1. 기본문법 활용 풀이
        // int [] answer = new int [num2 - num1 + 1];
        // for(int i = 0; i < num2 - num1 + 1; i++){
        //     answer[i] = numbers[num1 + i];
        // }
        // return answer;
        
        // //2. Stream 활용 풀이 1) : Arrays.stream의 매개변수 활용
        // return Arrays.stream(numbers, num1, num2 + 1).toArray();
        
        // // 3. Stream 활용 풀이 2) : IntStream의 range 활용
        // return IntStream.range(num1, num2 + 1).map(i -> numbers[i]).toArray();
        
        //4. Stream 활용 풀이 3) : Arrays의 copyOfRange 활용
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
        // return Arrays.stream(numbers).filter((v, idx) -> num1 <= idx && idx <= num2).mapToInt(Integer :: intValue);
    }
}