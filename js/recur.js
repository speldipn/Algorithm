function countDown(num) {
  if(num <= 0) {
    console.log("All done!");
    return;
  }
  console.log(num);
  num -= 1;
  countDown(num);
}

//countDown(10);

function sumRange(num) {
  if(num === 1) return 1;
  return num + sumRange(num-1);
}

// start 1 ~
//for(let i = 1; i <= 10; ++i) {
//  console.log(sumRange(i));
//}

function factorial(num) {
  if(num <= 1) {
    return 1;
  }
  return num * factorial(num-1);
}

for(let i = 0; i <= 5; ++i) {
  process.stdout.write(`${i}!: `);
  console.log(factorial(i));
}
