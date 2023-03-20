class Solution {
    public int solution(int[] numbers) {
        //1. 기본 풀이
        int max = numbers[0]*numbers[1];
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(i != j && max < numbers[i] * numbers[j]){
                    max = numbers[i] * numbers[j];
                }
            }
        }
        return max;
    }
}