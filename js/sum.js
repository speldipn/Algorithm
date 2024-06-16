// "hellothere";
// console.log(maxSubarraySum([1, 2, 5, 2, 8, 1, 5], 2)); // 10
// console.log(maxSubarraySum([1, 2, 5, 2, 8, 1, 5], 4)); // 17
// console.log(maxSubarraySum([4, 2, 1, 6], 1)); // 6
// console.log(maxSubarraySum([4, 2, 1, 6, 2], 4)); // 13
// console.log(maxSubarraySum([], 4)); // null

// My Algorithm
function maxSubarraySum(arr, n) {
  if (arr.length === 0) return null;

  let max = 0;
  for (let i = 0; i < arr.length; ++i) {
    let values = [];
    if (i + n > arr.length) {
      valeus = [];
      // const a = arr.slice(i, i + n);
      // const b = arr.slice(0, (i + n) % arr.length);
      // values = [...a, ...b];
    } else {
      values = arr.slice(i, i + n);
    }
    const sum = values.reduce((total, v) => total + v, 0);
    if (sum > max) {
      max = sum;
    }
  }
  return max;
}

// Udemy Algorithm
function maxSubarraySum1(arr, num) {
  if (num > arr.length) {
    return null;
  }
  var max = -Infinity;
  for (let i = 0; i < arr.length - num + 1; ++i) {
    temp = 0;
    for (let j = 0; j < num; ++j) {
      temp += arr[i + j];
    }
    if (temp > max) {
      max = temp;
    }
  }
  return max;
}

function slidingWindow(arr, num) {
  if (num > arr.length) {
    return null;
  }
  let sum = 0;
  for (let i = 0; i < num; ++i) {
    sum += arr[i];
  }
  let max = sum;
  for (let i = num; i < arr.length; ++i) {
    sum = sum - arr[i - num] + arr[i];
    max = Math.max(max, sum);
  }
  return max;
}

function assert(v, result) {
  if (v != result) {
    console.error("[ Failed! ]", v, result);
  } else {
    console.log("[ Pass ]", v, result);
  }
}

console.log("[Mine]");
assert(maxSubarraySum([1, 2, 5, 2, 8, 1, 5], 2), 10);
assert(maxSubarraySum([1, 2, 5, 2, 8, 1, 5], 4), 17);
assert(maxSubarraySum([4, 2, 1, 6], 1), 6);
assert(maxSubarraySum([4, 2, 1, 6, 2], 4), 13);
assert(maxSubarraySum([], 4), null);
assert(maxSubarraySum([2, 6, 9, 2, 1, 8, 5, 6, 3], 3), 19);

console.log("======================================");
console.log("[Yours]");
assert(maxSubarraySum1([1, 2, 5, 2, 8, 1, 5], 2), 10);
assert(maxSubarraySum1([1, 2, 5, 2, 8, 1, 5], 4), 17);
assert(maxSubarraySum1([4, 2, 1, 6], 1), 6);
assert(maxSubarraySum1([4, 2, 1, 6, 2], 4), 13);
assert(maxSubarraySum1([], 4), null);
assert(maxSubarraySum1([2, 6, 9, 2, 1, 8, 5, 6, 3], 3), 19);

console.log("======================================");
console.log("[Yours - Sliding Winow]");
assert(slidingWindow([1, 2, 5, 2, 8, 1, 5], 2), 10);
assert(slidingWindow([1, 2, 5, 2, 8, 1, 5], 4), 17);
assert(slidingWindow([4, 2, 1, 6], 1), 6);
assert(slidingWindow([4, 2, 1, 6, 2], 4), 13);
assert(slidingWindow([], 4), null);
assert(slidingWindow([2, 6, 9, 2, 1, 8, 5, 6, 3], 3), 19);
