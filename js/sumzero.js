// My Algorithm
function sumZero(arr) {
  for (let i in arr) {
    let value = arr[i];
    if (value !== 0 && arr.includes((-1) * value)) {
      return [value, (-1) * value];
    }
  }
  return;
}

// Udemy Algorithm
function sumZero1(arr) {
  let left = 0;
  let right = arr.length - 1;
  while (left < right) {
    let sum = arr[left] + arr[right];
    if (sum === 0) {
      return [arr[left], arr[right]];
    } else if (sum > 0) {
      right--;
    } else {
      ++left;
    }
  }
}

console.log("[Mine]")
console.log(sumZero([-3, -2, -1, 0, 1, 2, 3]));
console.log(sumZero([-2, 0, 1, 3]));
console.log(sumZero([1, 2, 3]));
console.log(sumZero([-4, -3, -2, -1, 0, 5, 10]));

console.log("==========================")
console.log("[Yours]")
console.log(sumZero1([-3, -2, -1, 0, 1, 2, 3]));
console.log(sumZero1([-2, 0, 1, 3]));
console.log(sumZero1([1, 2, 3]));
console.log(sumZero1([-4, -3, -2, -1, 0, 5, 10]));