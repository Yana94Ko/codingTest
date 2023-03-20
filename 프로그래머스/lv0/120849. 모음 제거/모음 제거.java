class Solution {
    public String solution(String my_string) {
        //1. for문을 이용한 기본 풀이
        String answer = "";
        String [] vowels = {"a", "e", "i", "o", "u"};
        String [] spells = my_string.split("");
        for(String spell : spells){
            int cnt = 0;
            for(String vowel : vowels){
                if(spell.equals(vowel)){
                    cnt++;
                }
            }
            if(cnt==0){
                answer+=spell;
            }
        }
        return answer;
            
        //2. Stream을 이용한 풀이
    }
}