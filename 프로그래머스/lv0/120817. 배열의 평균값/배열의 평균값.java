class Solution {
    public double solution(int[] numbers) {
        double sum = 0;
        for(int i : numbers){
            sum += i;
        }
        double answer = sum / numbers.length;
        return answer;
    }
}