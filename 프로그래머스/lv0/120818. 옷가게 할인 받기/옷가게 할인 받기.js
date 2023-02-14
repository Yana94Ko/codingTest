function solution(price) {
    return price < 100000 ? price 
        : price < 300000 ? Math.trunc(price*0.95) 
        : price < 500000 ? Math.trunc(price*0.9) : Math.trunc(price*0.8);
}