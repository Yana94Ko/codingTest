import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> baguni = new Stack<Integer>();
        
        //입력된 크레인 작동 횟수만큼 반복
        for(int i = 0; i < moves.length; i++){
            //격자의 세로길이만큼 반복
            for(int j = 0; j<board.length; j++){
                //크레인이 집은 곳이 빈곳이 아닐 때에만 아래를 실행
                if(board[j][moves[i]-1]!=0){
                    //바구니가 비어있다면(스택이 비어있다면)  
                    if(baguni.empty()){
                        //크레인이 집은 위치에 있던 값을 가져와 저장하고
                        baguni.push(board[j][moves[i]-1]);
                        //해당 위치의 값을 0으로 변경해준 뒤
                        board[j][moves[i]-1]=0;
                        //반복문 탈출해서 다음 move를 진행
                        break;
                    }else{//바구니가 비어있지 않고
                        //바구니에 담겨있느 마지막 값과, 크레인이 집은 위치의 값이 같다면
                        if(baguni.peek()==board[j][moves[i]-1]){
                            //바구니에 담겨있는 마지막 값을 꺼내고
                            baguni.pop();
                            //답에 2개를 추가해줘
                            answer +=2;
                        }else{
                            //바구니에 해당 위치의 값을 담아줘
                            baguni.push(board[j][moves[i]-1]);
                        }
                        //그리고 격자 위에서 크레인이 집은 곳의 값을 0으로 바꿔준 뒤
                        board[j][moves[i]-1]=0;
                        //반복문탈출
                        break;
                    }
                }
            }
        }
        return answer;
    }
}