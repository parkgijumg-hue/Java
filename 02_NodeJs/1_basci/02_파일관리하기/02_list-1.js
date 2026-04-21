const fs = require('fs');
// fs 모듈: 파일/폴더를 다루는 Node 기본 모듈

// Sync = 동기로 처리 (읽기가 끝날 때까지 다음 줄로 못 넘어감)
let files = fs.readdirSync('./');
// 현재 폴더의 파일/폴더 이름 배열을 출력
console.log(files);
