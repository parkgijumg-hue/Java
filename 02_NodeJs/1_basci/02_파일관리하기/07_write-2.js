const fs = require('fs');
// example.txt를 동기로 읽기
const data = fs.readFileSync('./example.txt', 'utf-8');

// 파일이 이미 있는지 확인 후 없을 때만 생성
if (fs.existsSync('text-1.txt')) {
  console.log('파일이 존재함');
} else {
  fs.writeFileSync('./text-1.txt', data);
}
