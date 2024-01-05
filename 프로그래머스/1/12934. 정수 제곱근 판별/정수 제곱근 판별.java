class Solution {
    public long solution(long n) {
        double sqrtN = Math.sqrt(n);
        return Math.floor(sqrtN) == sqrtN ? (long) Math.pow(sqrtN + 1, 2) : -1;
    }
}
// import java.util.stream.LongStream;

// class Solution {
//     public long solution(long n) {
//         return (LongStream
//             .range(1, (long) Math.sqrt(n)+1)
//             .filter(v -> n % v ==0 && n/v == v)
//             .count() != 0)
//             ? (long) Math.pow( Math.sqrt(n) + 1, 2) : -1;
//     }
// }
// class Solution {
//     public long solution(long n) {
//         return n % Math.sqrt(n) == 0 ? (long) Math.pow( Math.sqrt(n)+1,2) : -1;
//     }
// }
