
function solution(nums) {
    let answer = 0;

    for(let i = 0; i < nums.length - 2; i++) {
        for(let j = i + 1; j < nums.length - 1; j++) {
            for(let k = j + 1; k < nums.length; k++) {
                let sum = nums[i] + nums[j] + nums[k];
                if(sum % 2 !== 0 && checkPrime(sum)) {
                    answer++;
                }
            }
        }
    }
    
    return answer;
}

function checkPrime(sum) {
    for (let i = 3; i <= Math.sqrt(sum); i+=2) {
        if (sum % i === 0) return false;
    }
    return true;
}
