class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        //1. compareTo() 사용
        for(String str1 : s1){
            for(String str2 : s2){
                if (str1.compareTo(str2) == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }
}