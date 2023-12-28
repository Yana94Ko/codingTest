class Stack {
    constructor(){
        this.arr = [];
        this.idx = 0;
    }
    push(item){
        this.arr[this.idx++] = item;
    }
    pop(){
        if(this.idx == 0) return null;
        const result = this.arr[--this.idx];
        return result;
    }
    isEmpty(){
        if(this.idx == 0) return true;
        return false;
    }
}
function solution(s){
    const stack = new Stack();
    //const brackets = s.split('');
    for(const bracket of s.split('')){
        if(bracket=="("){
            stack.push(bracket);
        }else{
            if(stack.isEmpty()){
                return false;
            }
            stack.pop();
        }
    }
    return stack.isEmpty();
}