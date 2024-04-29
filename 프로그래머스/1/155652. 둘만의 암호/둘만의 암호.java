import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        List<String> checkList = new ArrayList<>();
        char[] skipChars = skip.toCharArray();
        
        for(int i = 97; i < 123; i++){
            String newAlpha = Character.toString((char) i);
            if(!skip.contains(newAlpha)) checkList.add(newAlpha);
        }
        
        for(String str : s.split("")){
            int newIdx = checkList.indexOf(str) + index;
            while(checkList.size() <= newIdx) newIdx -= checkList.size();
            
            sb.append(checkList.get(newIdx));
        }
        
        
        return sb.toString();
    }
}