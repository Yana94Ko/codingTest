import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        // //1. for문과 arrayList를 사용한 풀이
        // ArrayList <Integer> answer = new ArrayList<>();
        // for(int i = 0; i <= n; i++){
        //     if(i % 2 == 1) answer.add(i);
        // }
        // return answer.stream().mapToInt(Integer::intValue).toArray();
        
        //2.stream을 이용한 풀이
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
}