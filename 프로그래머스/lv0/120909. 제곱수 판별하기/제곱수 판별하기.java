import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return (IntStream.range(1, n/2).filter(v -> n/v == v && n % v ==0).count() != 0)? 1 : 2;
    }
}