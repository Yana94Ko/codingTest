import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int cnt1 = (int) Arrays.stream(num_list).filter(i -> i % 2 == 0).count();
        return new int [] {cnt1, num_list.length - cnt1};
    }
}