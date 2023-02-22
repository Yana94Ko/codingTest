class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int [num];
        
        int startNum = (total - (num * (1 + num) / 2)) / num;

        for(int i=0; i< num; i++){
                answer[i] = i + startNum + 1;
        }
        
        return answer;
    }
}