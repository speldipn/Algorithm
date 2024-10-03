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
  console.log("%d!: %d", i, factorial(i));
}

function collectOddValues(arr) {
  let result = [];

  function helper(helperInput) {
    if(helperInput.length === 0) {
      return;
    }
    if(helperInput[0] % 2 !== 0) {
      result.push(helperInput[0]);
    }
    helper(helperInput.slice(1));
  }

  helper(arr);

  return result;
}

function collectEvenValues(arr) {
  let result = [];

  function helper(helperInput) {
    if(helperInput.length === 0) {
      return;
    }
    if(helperInput[0] % 2 === 0) {
      result.push(helperInput[0]);
    }
    helper(helperInput.slice(1));
  }

  helper(arr);

  return result;
}

console.log(collectOddValues([1,2,3,4,5,6,7,8,9,10]));
console.log(collectEvenValues([1,2,3,4,5,6,7,8,9,10]));
console.log([1].concat(collectOddValues([2,3,4,5])));

