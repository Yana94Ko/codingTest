// import java.util.stream.LongStream;

// class Solution {
//     public long solution(long n) {
//         return (LongStream
//             .range(1, n/2)
//             .filter(v -> n % v ==0 && n/v == v)
//             .count() != 0)
//             ? (long) Math.pow( Math.sqrt(n)+1, 2) : -1;
//     }
// }
class Solution {
    public long solution(long n) {
        return n % Math.sqrt(n) == 0 ? (long) Math.pow( Math.sqrt(n)+1,2) : -1;
    }
}
