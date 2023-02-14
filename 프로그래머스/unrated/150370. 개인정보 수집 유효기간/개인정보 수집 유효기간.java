import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<Integer>();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate currentDate = LocalDate.parse(today, format);
        LocalDate writeDate = null;
        int idx = 1;
        
        for(String privacy : privacies){
            String wd = privacy.split(" ")[0];
            writeDate = LocalDate.parse(wd, format);
            LocalDate expireDate = null;
            for(String term : terms){
                if(term.split(" ")[0].equals(privacy.split(" ")[1])){
                    int whileMonth = Integer.parseInt(term.split(" ")[1]);
                    expireDate = writeDate.plusMonths(whileMonth);
                    expireDate = expireDate.minusDays(1);
                }
            }
            if(expireDate.isBefore(currentDate)){
                answer.add(idx);
            }
            idx++;
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}