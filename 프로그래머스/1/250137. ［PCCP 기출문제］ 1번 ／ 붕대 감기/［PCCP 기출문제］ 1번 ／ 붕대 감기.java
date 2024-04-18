class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int life = health;
        int lastAttackTime=attacks[attacks.length-1][0];
        int attackIdx = 0;
        int bandageIdx = 0;
        
        for(int time = 0; time <= lastAttackTime ; time++){
            //현재 타임에 공격이 들어왔다면
            if(time == attacks[attackIdx][0]){
                //bandageIdx 초기화
                bandageIdx=0;
                //생명력 깎기
                life -= attacks[attackIdx][1];
                //다음 공격 idx 탐색을 위한 attackIdx 증가
                attackIdx++;
            }else{
                //힐
                life += bandage[1];
                //연속힐 idx 증가
                bandageIdx++;
                //연속 힐 성공했을 시
                if(bandageIdx==bandage[0]){
                    //연속힐 초기화
                    bandageIdx=0;
                    //추가 힐
                    life += bandage[2];
                }
            }
            
            //생명이 다 닳았다면 -1 반환
            if(life <= 0) return -1;
            //생명이 최대치보다 크게 설정되었다면 최대치로 수정
            if(life > health) life=health;
            
        }
        
        return life;
    }
}