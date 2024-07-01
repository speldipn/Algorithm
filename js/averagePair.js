function averagePair() {
  if (arguments[0].length === 0) {
    return false;
  }
  const target = arguments[1] * 2;
  for (let v of arguments[0]) {
    if (arguments[0].indexOf(target - v) > 0) {
      return true;
    }
  }

  return false;
}

console.log(averagePair([1, 2, 3], 2.5)); // true
console.log(averagePair([1, 3, 3, 5, 6, 7, 10, 12, 19], 8)); // true
console.log(averagePair([-1, 0, 3, 4, 5, 6], 4.1)); // false
console.log(averagePair([], 4)); // false
