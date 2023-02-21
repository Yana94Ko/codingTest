function solution(arr) {
    let answer = arr.filter(element => Math.min(...arr) !== element);
    return  answer.length === 0 ? [-1] : answer;
}