import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        ArrayList <Integer> mins = new ArrayList<Integer>();
        ArrayList <Integer> maxs  = new ArrayList<Integer>();
        
        //가로 세로를 명함 단길이 / 장길이로 다시 분류
        for(int[] size : sizes){
            int n = size[0];
            int m = size[1];
            if(n < m){
                mins.add(n);
                maxs.add(m);
            }else{
                mins.add(m);
                maxs.add(n);
            }
        }
        Collections.sort(mins);
        Collections.sort(maxs);
        
        //분류된 단길이 최대값 * 장길이 최댓값 반환
        return mins.get(sizes.length-1)*maxs.get(sizes.length-1);
    }
}