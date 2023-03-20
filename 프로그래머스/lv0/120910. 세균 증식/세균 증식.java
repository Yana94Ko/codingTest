class Solution {
    public int solution(int n, int t) {
        //1. 기본 문법 풀이
        int answer = n;
        while(t != 0){
            answer = answer * 2;
            t -= 1;
        }
        return answer;
    }
}