import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        //1. Math 활용 풀이
        return n % Math.sqrt(n) == 0? 1 : 2;
        
        // //2. IntStream 활용한 풀이
        // return (IntStream.range(1, n/2).filter(v -> n/v == v && n % v ==0).count() != 0)? 1 : 2;
    }
}