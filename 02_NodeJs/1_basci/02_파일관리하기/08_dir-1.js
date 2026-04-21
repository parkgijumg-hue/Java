const fs = require('fs');
// 폴더가 없으면 새로 생성, 있으면 메시지 출력
if (fs.existsSync('./test')) {
  console.log('있음');
} else {
  fs.mkdir('./test', (err) => {
    if (err) {
      return console.error(err);
    }
    console.log('생성');
  });
}
