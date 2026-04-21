const fs = require('fs');
// 중첩 폴더가 없으면 한 번에 생성 (recursive 옵션)
if (fs.existsSync('./test2/test3/test4')) {
  console.log('있음');
} else {
  fs.mkdir('./test2/test3/test4', { recursive: true }, (err) => {
    if (err) {
      return console.error(err);
    }
    console.log('생성');
  });
}
