import java.util.Arrays;

class Solution {
    public double solution(int[] numbers) {
        // double sum = 0;
        // for(int i : numbers){
        //     sum += i;
        // }
        // double answer = sum / numbers.length;
        // return answer;
        return Arrays.stream(numbers).average().orElse(0);
    }
}