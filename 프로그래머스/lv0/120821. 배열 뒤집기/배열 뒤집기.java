import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
        // //1. 기초풀이
        // int lastIdx = num_list.length - 1;
        // int[] answer = new int[num_list.length];
        // for(int i = lastIdx; i >= 0; i--){
        //     answer[lastIdx - i] = num_list[i];
        // }
        // return answer;
        
        //2. reverse 사용
        List<Integer> num_col = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        Collections.reverse(num_col);
        return num_col.stream().mapToInt(Integer::intValue).toArray();
    }
}