function solution(k, score) {
    var answer = [];
    let minK = score.slice(0,k).sort((a,b) => a-b)[0]
    var myScore = Array.from({length:k},() => 0);
    //(날짜가 k보다 작거나 같은 경우 - 가장 낮은 점수) 날짜가 k보다 큰 경우 k등의 점수 확인
    for(let i = 0; i < score.length; i++){
        if(i > k-1){//[i]번까지 자른 score에서 k번째 점수 확인해서 반환
            answer.push(score.slice(0,i+1).sort((a, b) => b - a)[k-1])
        }else{//가장 낮은 점수 반환
            answer.push(score.slice(0,i+1).sort((a, b) => b - a)[i])
        }
    }
    return answer;
}