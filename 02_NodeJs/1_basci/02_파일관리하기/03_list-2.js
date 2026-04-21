const fs = require('fs');
// 비동기 방식: 작업이 끝나면 콜백이 실행됨
fs.readdir('./', (err, files) => {
  if (err) {
    console.error(err);
    return;
  }
  // 현재 폴더의 파일/폴더 목록 출력
  console.log(files);
});
