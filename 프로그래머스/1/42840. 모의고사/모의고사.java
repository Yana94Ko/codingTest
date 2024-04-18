import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        int[] scores = {0,0,0};
        ArrayList<Integer> maxScore = new ArrayList<Integer>();
        int [][] supo={{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
        
        for (int i = 0; i < answers.length; i++){
            if(supo[0][i%5]==answers[i]){
                scores[0]++;
            }
            if(supo[1][i%8]==answers[i]){
                scores[1]++;
            }
            if(supo[2][i%10]==answers[i]){
                scores[2]++;
            }
        }
        
        int [] sortedScore = scores.clone();
        Arrays.sort(sortedScore);
        int max = sortedScore[2];
        for(int i = 0; i<scores.length;i++){
        	if(scores[i]==max) {
        		maxScore.add(i+1);
        	}
        }
        
        int[] answer = new int[maxScore.size()];
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = maxScore.get(i);
        }
        return answer;
    }
}