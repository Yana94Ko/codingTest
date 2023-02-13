function solution(emergency) {
    var answer = Array.from({length: emergency.length}, () => 1);
    for(let i = 0; i < emergency.length; i++){
        for(let er of emergency){
            if(emergency[i] < er){
                answer[i] = answer[i] +1;
            }
        }
    }
    return answer;
}