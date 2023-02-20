function solution(arr) {
    let answer = arr.filter(element => Math.min(...arr) !== element)
    console.log(answer)
    return  answer.length === 0 ? [-1] : answer;
}