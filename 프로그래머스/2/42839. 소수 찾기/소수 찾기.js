function solution(numbers) {
    var answer = 0;
    var visited = Array(numbers.length).fill(false);

    var set = new Set();
    
    const dfs = (numbers, line ,count) =>{
    if(count == numbers.length){
        return;
    }
    
    for(let i = 0; i< numbers.length; i++){
        if(!visited[i]){
            visited[i] = true;
            set.add(parseInt(line+numbers.charAt(i)))
            dfs(numbers, line+numbers.charAt(i), count+1 );
            visited[i] = false;

        }
    }
}
    
    const isPrime=(numbers)=>{
        if(numbers < 2){
            return false;
        }        
        for(let i = 2 ;i <= Math.sqrt(numbers); i++){
            if( numbers % i ==0 ){
                return false;
            }
        }
            return true;
    }
    dfs(numbers, "", 0);
    
    for( let i of set){
        if(isPrime(i)){
            answer++;
        }
    }
    return answer;
}

