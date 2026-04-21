const fs = require('fs');
// readFile: 파일을 "비동기"로 읽음 (콜백에서 결과 처리)
fs.readFile('./example.txt', 'utf-8', (erro, data) => {
  if (erro) {
    // 주의: erro/console.erro는 오타일 수 있음 (에러 확인 시 console.error 사용)
    console.erro(erro);
  }
  // 읽어온 텍스트 출력
  console.log(data);
});
