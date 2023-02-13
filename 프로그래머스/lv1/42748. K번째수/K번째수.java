import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];
        
        //입력된 commands의 길이만큼 아래 반복해
        for (int i = 0; i < commands.length; i++){
            int a,b,c;
            a=commands[i][0];
            b=commands[i][1];
            c=commands[i][2];
            
            //array배열의 a번째 값 부터 b번째 값 까지 담은 tmp배열 선언
            int[] tmp = Arrays.copyOfRange(array,a-1,b);
            //정렬
            Arrays.sort(tmp);
            //가장 큰 값을 answer배열에 반환
            answer[i]=tmp[c-1];
        }       
        return answer;
    }
}