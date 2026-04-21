function displayA() {
  console.log('A');
}

function displayB(Callback) {
  setTimeout(() => {
    console.log('<<2초 경과 후>>');
    console.log('B');
    Callback();
  }, 2000);
}
function displayC() {
  console.log('C');
}
displayA();
displayB(displayC);
