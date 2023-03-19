class Solution {
    public int solution(String[] s1, String[] s2) {
        // //1. compareTo() 사용
        // int answer = 0;
        // for(String str1 : s1){
        //     for(String str2 : s2){
        //         if (str1.compareTo(str2) == 0) {
        //             answer++;
        //         }
        //     }
        // }
        // return answer;
        
        //2. equals() 사용
        int answer = 0;
        for(String str1 : s1){
            for(String str2 : s2){
                if (str1.equals(str2)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}