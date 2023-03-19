class Solution {
    public String solution(String my_string, int n) {
        // // 1. for문을 이용한 기본 풀이
        // String answer = "";
        // String [] spells = my_string.split("");
        // for(int i = 0; i < spells.length; i++){
        //     for(int j = 0; j < n; j++){
        //         answer += spells[i];
        //     }
        // }
        // return answer;
        
        //2. Sting builder을 이용한 풀이
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++){
            sb.append((my_string.charAt(i)+"").repeat(n));
        }
        return sb.toString();
    }
}