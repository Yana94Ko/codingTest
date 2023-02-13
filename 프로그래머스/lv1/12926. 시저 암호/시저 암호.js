function solution(s, n) {
    var answer = '';
    for(let spell of s){
        //공백은 아무리 밀어도 공백입니다.
        if(spell==" "){
            answer+=" ";
            continue;
        }
        let ascii = spell.charCodeAt(0)+n;
        if(ascii > 90 && ascii < 97 || ascii > 122 || ascii >= 97 && ascii - n < 91){
            answer+=String.fromCharCode(ascii-26);
        }else{
            answer+=String.fromCharCode(ascii);
        }
    }
    
    return answer;
}