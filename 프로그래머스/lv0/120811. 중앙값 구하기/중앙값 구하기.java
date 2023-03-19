import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        // //1. stream 을 이용한 해법
        // return Arrays.stream(array).sorted().toArray()[array.length / 2];
        
        //2. Array의 sort를 사용한 해법
        Arrays.sort(array);
        return array[array.length / 2];
    }
}