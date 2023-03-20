import java.util.stream.Collectors;
import java.util.Arrays;

class Solution {
    public String solution(String rsp) {
        // //1. for 문을 이용한 기본 풀이
        // String answer = "";
        // for(int i = 0; i < rsp.length(); i++){
        //     switch(rsp.charAt(i)+""){
        //         case "2" : answer += "0"; break;
        //         case "0" : answer += "5"; break;
        //         case "5" : answer += "2"; break;
        //     }
        // }
        // return answer;
        
        //2. Stream을 이용한 풀이
        return Arrays.stream(rsp.split("")).map(v -> (v.equals("2")? "0" : (v.equals("0")? "5" : "2"))).collect(Collectors.joining());
    }
}