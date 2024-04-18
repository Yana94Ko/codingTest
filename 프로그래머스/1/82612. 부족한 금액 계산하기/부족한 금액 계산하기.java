class Solution {
    public long solution(int price, int money, int count) {
        long longPrice = price, longCount = count;
        long totalPrice = (2*longPrice + longPrice*(longCount-1))*longCount/2;
        long sum = totalPrice - money ;
        return sum <  0 ? 0 : sum;
    }
}