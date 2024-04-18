import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        //data의 구분값들
        Map<String, Integer> extIndex = Map.of("code", 0, "date", 1, "maximum", 2, "remain", 3);
        ArrayList<int[]> filteredData = new ArrayList<int[]>();
        
        for(int [] row : data){
            //data에서 ext 값이 val_ext보다 작은 데이터만 뽑은 후
            if(row[extIndex.get(ext)] < val_ext){
                filteredData.add(row);
            }
        }
        //sort_by에 해당하는 값을 기준으로 오름차순으로 정렬하여 return
        filteredData.sort((o1, o2) -> Integer.compare(o1[extIndex.get(sort_by)], o2[extIndex.get(sort_by)]));
        return filteredData.toArray(new int[filteredData.size()][]);
    }
    
    
}