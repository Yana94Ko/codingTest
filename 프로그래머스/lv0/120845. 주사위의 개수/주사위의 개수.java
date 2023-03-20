import java.util.stream.IntStream;

class Solution {
    public int solution(int[] box, int n) {
        // //1. 기본 풀이
        // for(int i = 0; i < box.length; i++){
        //     box[i] = box[i] / n;
        // }
        // return box[0] * box[1] * box[2];
        
        //2. Stream 활용 풀이
        int [] answer = IntStream.range(0, box.length).map(i -> box[i] / n).toArray();
        return answer[0] * answer[1] * answer[2];
    }
}