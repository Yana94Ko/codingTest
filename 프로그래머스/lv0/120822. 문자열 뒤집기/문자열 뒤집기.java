class Solution {
    public String solution(String my_string) {
        // //1. for문을 사용한 기본풀이
        // String answer = "";
        // String[] spells = my_string.split("");
        // for(int i = spells.length - 1; i >= 0; i--){
        //     answer += spells[i];
        // }
        // return answer;
        
        //2. String buffer을 사용하는 풀이(멀티스레드 가정, 소요시간 : )
        StringBuffer sb = new StringBuffer();
        sb.append(my_string).reverse();
        return sb.toString();
    }
}