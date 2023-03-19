class Solution {
    public int solution(int[] array, int n) {
        //1. for문을 이용한 풀이
        int answer = 0;
        for(int num : array){
            if(num == n){
                answer++;
            }
        }
        return answer;
    }
}