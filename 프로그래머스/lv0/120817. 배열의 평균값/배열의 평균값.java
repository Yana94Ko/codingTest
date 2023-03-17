import java.util.Arrays;

class Solution {
    public double solution(int[] numbers) {
        // double sum = 0;
        // for(int i : numbers){
        //     sum += i;
        // }
        // return (double) sum / numbers.length;
        return Arrays.stream(numbers).average().orElse(0);
    }
}