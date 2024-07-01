function sameFrequency(n1, n2) {
  const num1 = n1.toString();
  const num2 = n2.toString();

  if (num1.length !== num2.length) {
    return false;
  }
  const numCount1 = {};
  const numCount2 = {};

  for (let v1 of num1) {
    numCount1[v1] = (numCount1[v1] || 0) + 1;
  }
  for (let v2 of num2) {
    numCount2[v2] = (numCount2[v2] || 0) + 1;
  }

  console.log(numCount1, numCount2);

  for (let n in numCount1) {
    if (numCount1[n] !== numCount2[n]) {
      return false;
    }
  }

  return true;
}

let result = sameFrequency(182, 281); // true
console.log(result);
result = sameFrequency(34, 14); // false
console.log(result);
result = sameFrequency(3589578, 5879385); // true
console.log(result);
result = sameFrequency(22, 222); // false
console.log(result);
result = sameFrequency(0, 1); // false
console.log(result);
