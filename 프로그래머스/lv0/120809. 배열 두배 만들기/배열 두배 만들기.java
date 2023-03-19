class Solution {
    public int[] solution(int[] numbers) {
        //1. for문을 이용한 기본 풀이
        int [] answer = new int [numbers.length];
        for(int i = 0; i < numbers.length; i++){
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}