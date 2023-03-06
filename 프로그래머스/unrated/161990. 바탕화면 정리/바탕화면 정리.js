function solution(wallpaper) {
    var answer = [wallpaper.length, wallpaper[0].length, 0, 0];
    //lux : 왼쪽에서 시작해서 첫번째로 파일을 가지는 행의 index
    //luy : 위부터 시작해서 첫번째로 파일을 가지는 열의 index
    //rdx : 왼쪽에서 시작해서 마지막으로 파일을 가지는 행
    //rdy : 위쪽에서 시작해서 마지막으로 파일을 가지는 열
    var indexies = [];
    for(let x = 0; x < wallpaper.length; x++){
        for(let y = 0; y < wallpaper[x].length; y++){
            if (wallpaper[x][y] == "#"){
                if(x < answer[0]){
                    answer[0] = x;
                }
                if(y < answer[1]){
                    answer[1] = y;
                }
                if(x > answer[2]){
                    answer[2] = x;
                }
                if(y > answer[3]){
                    answer[3] = y;
                }
            }
        }    
    };
    answer[2] = answer[2] + 1;
    answer[3] = answer[3] + 1;
    return answer;
}