const fs = require('fs');
// 동기 함수로 작성하기: 읽고 쓸 때까지 대기
const data = fs.readFileSync('./example.txt', 'utf-8');

// text-1.txt에 동일한 내용 쓰기
fs.writeFileSync('./text-1.txt', data);

// 비동기 함수로 작성하기(콜백에서 처리)
// const data = fs.readFile('./example.txt', 'utf-8',(err,data)=>{
//     if(err){
//         console.error(err)
//     }
//     fs.writeFile('./text-1.txt', data)
// })
