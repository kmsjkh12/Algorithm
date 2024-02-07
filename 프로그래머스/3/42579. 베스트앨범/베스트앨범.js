function solution(genres, plays) {
   
     const chart = genres.reduce((obj, genre, i) => {
    if (!obj[genre]) {
      obj[genre] = { playCount: plays[i], list: [] };
    } else {
      obj[genre].playCount += plays[i];
    }

    obj[genre].list.push([i, plays[i]]);

    return obj;
  }, {});

    const sorted = Object.values(chart).sort((a,b)=>{
        return b.playCount - a.playCount;
    })
    
    const answer = sorted.reduce((acc, genre) => {
    genre.list.sort((a, b) => {
      return b[1] - a[1];
    });
    
    // 5.에 해당하는 부분
    acc.push(genre.list[0][0]);
    // 장르에 속한 곡이 2개부터 두 번 째 값을 넣어준다.
    if (genre.list.length > 1) {
      acc.push(genre.list[1][0]);
    }
    return acc;
  }, []);
    
    return answer;
}

//객체로 만들어서 sorting한 후 두개
//장르 별로 많이 재생된 노래를 두개 씩 모아 앨범 출시
//속한 노래가 많이 재생된 장르
//장르 내에서 많이 재생된 노래
//장르 내에서 재생 횟수가 같은 노래 중에서 고유 번호가 낮은 노래
//노래의 고유 번호 순서대로 리턴