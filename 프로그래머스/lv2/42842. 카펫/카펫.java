class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int area = brown + yellow;
        
        for (int i = 1; i <=area; i++){
            int row = i;        //세로 (가로보다 세로가 작으니, 세로부터 찾기)
            int col = area/row; //가로

            if (row > col)
                continue;
            
            if ((col-2)*(row-2)==yellow){
                answer[0]=col;
                answer[1]=row;
                return answer;
            }
        }
        return answer;
    }
}