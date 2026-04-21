const fs = require('fs');
// readFileSync: 파일을 "동기"로 읽음 (다 읽을 때까지 대기)
const rfs = fs.readFileSync('./example.txt', 'utf-8');
// 읽어온 내용을 콘솔에 출력
console.log(rfs);
