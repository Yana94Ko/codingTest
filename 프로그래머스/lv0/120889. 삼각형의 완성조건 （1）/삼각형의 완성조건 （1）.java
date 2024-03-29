import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        // //for문을 이용한 풀이
        // int max = sides[0], mid = sides[0], min = sides[0];
        // for(int side : sides){
        //     max = (max < side) ? side : max;
        //     mid = (mid < side) ? (side < max) ? side : mid : mid;
        //     min = (min > side) ? side : min;
        // }
        // return (max - mid - min < 0 ) ? 1 : 2;
        
        //2. Arrays를 사용한 풀이
        Arrays.sort(sides);
        return (sides[2] - sides[1] - sides[0] < 0) ? 1 : 2;
    }
}