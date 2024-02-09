function solution(brown, yellow) {
    var answer = [];
    
    var sum= brown + yellow;
 
    for(let i = 3; i<= brown; i++){
        if( sum % i === 0){
            let weight = sum / i;
            
            if( (i-2) * (weight-2) === yellow){
               
                return [ weight, i];
            }
        }  
    }
    
    return answer;
}