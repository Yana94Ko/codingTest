import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList <Integer> answer = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            if(i % 2 == 1) answer.add(i);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}