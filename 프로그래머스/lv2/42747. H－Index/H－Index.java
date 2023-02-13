import java.util.Arrays;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        //인용된 횟수가 적은것부터 정렬
        Arrays.sort(citations);
        //인용수대로 정렬된 각각의 논문에 대해서 아래 반복
        for(int i = 0; i<citations.length;i++){
            //h지수 = 총 논문의 갯수 - 현재 검토까지 검토완료한 논문수+1(지금 검토중인 것)
            int h = citations.length-i;
            
            //검토중인 논문의 인용 횟수가 h지수보다 크거나 같으면
            if(citations[i]>=h){
                //해당 지수 반환
                answer=h;
                break;
            }
        }
        
        return answer;
    }
}