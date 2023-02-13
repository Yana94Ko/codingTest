function solution(new_id) {
    var answer = new_id;
    answer = answer.toLowerCase() //1단계
        .replace(/[^\w-.]/g,"") //2단계
        .replace(/\.+/g,".") //3단계
        .replace(/^\.|\.$/g, "") //4단계
        .replace(/^$/,"a") //5단계
        .slice(0,15).replace(/\.$/, "") //6단계
    answer = answer.padEnd(3, answer[answer.length-1]) //7단계
    return answer;
}

function step1(new_id){
    //대문자 소문자로 치환
    let afterStep = new_id.toLowerCase();
    return afterStep;
}
function step2(new_id){
    //알파벳 소문자, 숫자, -, _, . 제외 모든 문자 제거
    let afterStep = ''
    for(let i = 0; i < new_id.length; i++){
        let ascii = new_id.charCodeAt(i);
        if(ascii >=97 && ascii <=122 || ascii >=48 && ascii <=57 ||ascii ==45 || ascii ==46 || ascii == 95){
            afterStep += String.fromCharCode(ascii);
        }
    }
    return afterStep;
    
}
function step3(new_id){
    //마침표 2개 연속된 경우 마침표로 치환
    while(new_id.includes("..")){
        new_id = new_id.replace("..",".");
    }
    return new_id;
}
function step4(new_id){
    //마침표가 처음이나 끝에 위치하면 제거
    if (new_id.startsWith(".")){
        new_id = new_id.slice(1);
    }
    if (new_id.endsWith(".")){
        new_id = new_id.slice(0,-1);
    }
    return new_id;
}
function step5(new_id){
    //빈 문자열이라면, a로 만들기
    if(new_id === ""){
        new_id = "a"
    }
    return new_id;
}
function step6(new_id){
    //길이가 16자 이상아면, 15개 제외한 문자 모두 제거.
    if(new_id.length > 15){
        new_id = new_id.slice(0,15);
    }
    //제거 후 마침표가 맨 끝에 위치하면 마침표 제거
    if (new_id.endsWith(".")){
        new_id = new_id.slice(0,-1);
    }
    return new_id;
}
function step7(new_id){
    //아이디가 2자 이하인 경우, 마지막 문자를 반복해서 길이가 3이 되도록
    while(new_id.length <= 2){
        new_id = new_id + new_id[new_id.length-1]
    }
    return new_id
}