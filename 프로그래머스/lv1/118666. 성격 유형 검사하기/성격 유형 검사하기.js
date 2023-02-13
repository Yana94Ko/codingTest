function solution(survey, choices) {
    var answer = 'RCJA';
    var obj = {
        R : 0,
        T : 0,
        C : 0,
        F : 0,
        J : 0,
        M : 0,
        A : 0,
        N : 0,
    }
    var idx = 0;
    //각 항목별 비율이 담긴 배열 만들기
    for(let choice of choices){
        let score = choice - 4;
        if(score < 0){
            obj[survey[idx][0]]-= score;
        }else if(score > 0){
            obj[survey[idx][1]] += score;
        }
        idx++;
    }
    console.log(obj)
    if(obj.R < obj.T){
        answer = answer.replace("R","T")
    }
    if(obj.C < obj.F){
        answer = answer.replace("C","F")
    }
    if(obj.J < obj.M){
        answer = answer.replace("J","M")
    }
    if(obj.A < obj.N){
        answer = answer.replace("A","N")
    }
    return answer;
}