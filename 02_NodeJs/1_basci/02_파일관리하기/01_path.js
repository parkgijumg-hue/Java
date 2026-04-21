const path = require('path');
// path 모듈: 파일/폴더 경로를 안전하게 조합/분해할 때 사용
// 경로 연결하기
// const fullpath = path.join('some', 'work', 'ex.txt');
// console.log(fullpath);

//절대 경로
// console.log(`파일 절대 경로:${__filename}`);

//경로 추출하기
// const dir = path.dirname(__filename);
// console.log(`경로만: ${dir}`);

//파일 이름 추출하기
// const fn = path.basename(__filename);
// const fn2 = path.basename(__filename, '.js');

// console.log(`파일 이름: ${fn}`);
// console.log(`파일 이름(확장자  제외): ${fn2}`);

//파일  확장자 추출
// const ext = path.extname(__filename);
// console.log(`파일  확장자: ${ext}`);
// console.log(path.basename(__filename, ext));

// 경로를 객체로 반환하기 - parse 함수
// __filename: 현재 파일의 절대 경로
const parsedPath = path.parse(__filename);
console.log(parsedPath);
