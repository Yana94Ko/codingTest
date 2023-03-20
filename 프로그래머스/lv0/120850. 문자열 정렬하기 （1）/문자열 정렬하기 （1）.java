import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        // //1. 기본 풀이
        // List <Integer> answer = new ArrayList <> ();
        // for(int i = 0; i < my_string.length(); i++){
        //     try{
        //         answer.add(Integer.parseInt(my_string.charAt(i)+""));
        //     }catch(Exception ec){
        //         continue;
        //     }
        // }
        // return answer.stream().mapToInt(i->i).sorted().toArray();
        
        //2. Stream과 정규표현식 활용 풀이
        return Arrays.stream(my_string.replaceAll("[A-Z|a-z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
    }
}