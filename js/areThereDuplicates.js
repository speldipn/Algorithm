function areThereDuplicates() {
  const countObj = {};
  for (let i = 0; i < arguments.length; ++i) {
    countObj[arguments[i]] = (countObj[arguments[i]] || 0) + 1;
    if (countObj[arguments[i]] > 1) {
      return true;
    }
  }
  return false;
}

console.log(areThereDuplicates(1, 2, 3)); // false
console.log(areThereDuplicates(1, 2, 2)); // true
console.log(areThereDuplicates("a", "b", "c", "a")); // true
