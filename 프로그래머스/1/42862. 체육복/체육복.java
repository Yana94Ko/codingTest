import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] clothCnts = new int[n+1]; 
        List<Integer> reserveList = new ArrayList<>(); 

        for (int i = 1; i <= n; i++) {
            clothCnts[i] = 1;
        }

        for (int lostIdx : lost) {
            clothCnts[lostIdx] -= 1;
        }

        for (int reserver : reserve) {
            clothCnts[reserver] += 1;
        }

        for (int j = 1; j <= n; j++) {
            if (clothCnts[j] > 1) { 
                if (j > 1 && clothCnts[j-1] == 0) { 
                    clothCnts[j-1]++;
                    clothCnts[j]--;
                } else if (j < n && clothCnts[j+1] == 0) {
                    clothCnts[j+1]++;
                    clothCnts[j]--;
                }
            }
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (clothCnts[i] > 0) {
                count++;
            }
        }

        return count;
    }
}
