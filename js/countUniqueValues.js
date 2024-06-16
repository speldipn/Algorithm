// My Algorithm
function countUniqueValues(values) {
  const set = new Set();
  for (let i in values) {
    set.add(values[i]);
  }
  return set.size;
}

// [1,2,3,3,4,5,6,6,7]
// Udemy Algorithm
function countUniqueValues1(arr) {
  if (arr.length === 0) return 0;
  var i = 0;
  for (var j = 1; j < arr.length; ++j) {
    if (arr[i] !== arr[j]) {
      ++i;
      arr[i] = arr[j];
    }
  }
  return i + 1;
}

console.log("[Mine]");
console.log(countUniqueValues([1, 1, 1, 1, 1, 2])); // 2
console.log(countUniqueValues([1, 2, 3, 4, 4, 4, 7, 7, 12, 12, 13])); // 7
console.log(countUniqueValues([])); // 0
console.log(countUniqueValues([-2, -1, -1, 0, 1])); // 4
console.log(countUniqueValues([1, 1, 1, 2, 2, 3, 4, 5, 5, 5, 6, 7])); // 4

console.log("[Yours]");
console.log(countUniqueValues1([1, 1, 1, 1, 1, 2])); // 2
console.log(countUniqueValues1([1, 2, 3, 4, 4, 4, 7, 7, 12, 12, 13])); // 7
console.log(countUniqueValues1([])); // 0
console.log(countUniqueValues1([-2, -1, -1, 0, 1])); // 4
console.log(countUniqueValues1([1, 1, 1, 2, 2, 3, 4, 5, 5, 5, 6, 7])); // 4
