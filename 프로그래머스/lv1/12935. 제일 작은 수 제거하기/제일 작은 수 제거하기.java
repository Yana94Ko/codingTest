import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList <Integer> result = new ArrayList<Integer>();
        int min = Arrays.stream(arr).min().getAsInt();
        for(int num : arr){
            if(num != min){
                result.add(num);//자바의 경우 배열의 끝에 추가하기 위해 push 가 아닌 add 사용
            }
        }
        int [] answer = result.stream().mapToInt(Integer::intValue).toArray();
        
        return (answer.length != 0) ? answer : new int [] {-1};
    }
}