import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0, max = 0;
        int cntArr[] = new int[1000];
        
        for(int i = 0; i < array.length; i++) {
            cntArr[array[i]]++;
            
            if(max < cntArr[array[i]]) {
                max = cntArr[array[i]];
                answer = array[i];
            }
        }
        
        //중복 여부 판별
        int temp = 0;
        for(int j = 0; j < 1000; j++) {
            if(max == cntArr[j]) temp++;
            if(temp > 1) answer = -1;
        }
        return answer;
    }
}