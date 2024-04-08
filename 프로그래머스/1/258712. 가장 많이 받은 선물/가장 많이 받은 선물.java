import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        Map<String, Integer> friendsIdx = new HashMap<>();
        Map<Integer, Map<Integer, Integer>> giftLogs = new HashMap<>();
        Map<Integer, Integer> giftScore = new HashMap<>();
        Map<Integer, Integer> nextMonthGifts = new HashMap<>();
    
        //초기화
        int idx = 0;
        for (String friend : friends) {
            friendsIdx.put(friend, idx);
            giftLogs.put(idx, new HashMap<>());
            giftScore.put(idx, 0);
            nextMonthGifts.put(idx, 0);
            idx++;
        }
        
        // 과거 기록 정리
        for (String gift : gifts) {
            StringTokenizer st = new StringTokenizer(gift);
            int giver = friendsIdx.get(st.nextToken());
            int taker = friendsIdx.get(st.nextToken());

            giftLogs.get(giver).put(taker, giftLogs.get(giver).getOrDefault(taker, 0) + 1);
            giftScore.put(giver, giftScore.get(giver) + 1);
            giftScore.put(taker, giftScore.get(taker) - 1);
        }
        
        //비교 및 nextMonthGifts setting
        for (int giver = 0; giver < friends.length; giver++) {
            for (int taker = 0; taker < friends.length; taker++) {
                if (giver != taker) {
                    int giftsCntFromGiver = giftLogs.get(giver).getOrDefault(taker, 0);
                    int giftsCntFromTaker = giftLogs.get(taker).getOrDefault(giver, 0);

                    if (giftsCntFromGiver > giftsCntFromTaker) {
                        nextMonthGifts.put(giver, nextMonthGifts.get(giver) + 1);
                    } else if (giftsCntFromGiver == giftsCntFromTaker && giftScore.get(giver) > giftScore.get(taker)) {
                        nextMonthGifts.put(giver, nextMonthGifts.get(giver) + 1);
                    }
                }
            }
        }
        
        //nextMonthGifts Collection 최대값 반환
        return Collections.max(nextMonthGifts.values());
    }
}


class Solution2 {
    public int solution(String[] friends, String[] gifts) {
        // 친구 수
        int friendsCnt = friends.length;
        
        // 친구별 인덱스 부여
        Map<String, Integer> friendsIdx = new HashMap<>();
        for (int i = 0; i < friendsCnt; i++) {
            friendsIdx.put(friends[i], i);
        }
        
        // 다음달 선물 예측
        Map<Integer, Integer> nextMonthGifts = new HashMap<>();
        for (int i = 0; i < friendsCnt; i++) {
            nextMonthGifts.put(i, 0);
        }
        
        // 과거 선물 기록
        int[][] giftLogs = new int[friendsCnt][friendsCnt];
        for (String gift : gifts) {
            StringTokenizer st = new StringTokenizer(gift);
            int giver = friendsIdx.get(st.nextToken());
            int taker = friendsIdx.get(st.nextToken());
            giftLogs[giver][taker]++;
        }
        
        // 선물 예측 로직
        for (int giverIdx = 0; giverIdx < friendsCnt; giverIdx++) {
            for (int takerIdx = 0; takerIdx < friendsCnt; takerIdx++) {
                if (giverIdx != takerIdx) { // 본인 제외
                    if (giftLogs[giverIdx][takerIdx] != giftLogs[takerIdx][giverIdx]) {
                        // 선물을 주고받았으면서, 누가 더 많이 줬나?
                        int nextMonthTaker = giftLogs[giverIdx][takerIdx] > giftLogs[takerIdx][giverIdx] ? giverIdx : takerIdx;
                        nextMonthGifts.put(nextMonthTaker, nextMonthGifts.get(nextMonthTaker) + 1);
                    }
                }
            }
        }
        
        // 최대값 반환
        return Collections.max(nextMonthGifts.values());
    }
    
    // 선물 지수 계산
    private int getGiftScore(int[][] giftLogs, int personIdx) {
        int sentCount = 0;
        int receivedCount = 0;
        for (int i = 0; i < giftLogs.length; i++) {
            sentCount += giftLogs[personIdx][i];
            receivedCount += giftLogs[i][personIdx];
        }
        return sentCount - receivedCount;
    }
}