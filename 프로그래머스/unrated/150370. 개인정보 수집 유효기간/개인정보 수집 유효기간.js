function solution(today, terms, privacies) {
    var answer = [];
    today = new Date(today);
    var idx = 1;
    for(let privacy of privacies){
        var writeDate = new Date(privacy.split(" ")[0]);
        let writeTerm = privacy.split(" ")[1];
        var endDate = writeDate;
        
        for(let term of terms){
            if(term.split(" ")[0] == writeTerm){
                let whileMonth = parseInt(term.split(" ")[1]);
                endDate = new Date(endDate.setMonth(endDate.getMonth() + whileMonth));
            }
        }
        console.log(endDate, today)
        if(endDate <= today){
            answer.push(idx);
        }
        idx ++;
    }
    return answer;
}