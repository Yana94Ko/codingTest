class Solution {
    public int solution(String my_string) {
        //for문을 이용한 풀이
        int answer = 0;
        String [] strArr = my_string.split("");
        for(String spell : strArr){
            try{
                Integer.parseInt(spell);
                answer += Integer.parseInt(spell);
            }catch(NumberFormatException ex){
                continue;
            }
        }
        return answer;
    }
}