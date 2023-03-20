class Solution {
    public int solution(int n, int t) {
        // //1. 기본 문법 풀이
        // int answer = n;
        // while(t != 0){
        //     answer = answer * 2;
        //     t -= 1;
        // }
        // return answer;
        
        // //2. Math.pow 활용
        // return n * ((int) Math.pow(2, t));
        
        //3. 증가하는 비율이 2의 제곱인 상황에서 사용 할 수 있는 비트연산자
        return n << t;
    }
}