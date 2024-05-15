function print(a, b) {
  // console.log(a, b);
  process.stdout.write(`${a}, ${b}: `);
}

// my algorithm
function same(a, b) {
  print(a, b)

  for (let i = 0; i < a.length; ++i) {
    const idx = b.indexOf(a[i] ** 2);
    if (idx >= 0) {
      b.splice(idx, 1);
    } else {
      return false;
    }
  }
  return true;
}

// udemy algorithm
function same2(a, b) {
  print(a, b);

  if (a.length !== b.length) {
    return false;
  }
  for (let i = 0; i < a.length; ++i) {
    let correctIndex = b.indexOf(a[i] ** 2);
    if (correctIndex === -1) {
      return false;
    }
    b.splice(correctIndex, 1);
  }
  return true;
}

// udemy algorithm 2
function same3(a, b) {
  print(a, b);

  if (a.length !== b.length) {
    return false;
  }
  let frequncyCount1 = {};
  let frequncyCount2 = {};
  for (let val of a) {
    frequncyCount1[val] = (frequncyCount1[val] || 0) + 1;
  }
  for (let val of b) {
    frequncyCount2[val] = (frequncyCount2[val] || 0) + 1;
  }
  for (let key in frequncyCount1) {
    if (!(key ** 2 in frequncyCount2)) { // not existed 
      return false;
    }
    if (frequncyCount2[key ** 2] != frequncyCount1[key]) { // not match count
      return false;
    }
  }
  return true;
}

const s1 = new Date();
console.log(same([1, 2, 3, 1], [4, 1, 9, 1]));
console.log(same([1, 2, 3], [1, 9]));
console.log(same([1, 2, 1], [4, 4, 1]));
const e1 = new Date();
const diff1 = (e1.getTime() - s1.getTime()) / 1000;

console.log("================================")

const s2 = new Date();
console.log(same2([1, 2, 3, 1], [4, 1, 9, 1]));
console.log(same2([1, 2, 3], [1, 9]));
console.log(same2([1, 2, 1], [4, 4, 1]));
const e2 = new Date();
const diff2 = (e2.getTime() - s2.getTime()) / 1000;

console.log("================================")

const s3 = new Date();
console.log(same3([1, 2, 3, 1], [4, 1, 9, 1]));
console.log(same3([1, 2, 3], [1, 9]));
console.log(same3([1, 2, 1], [4, 4, 1]));
const e3 = new Date();
const diff3 = (e3.getTime() - s3.getTime()) / 1000;

console.log();
console.log(diff1, diff2, diff3);