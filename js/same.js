function print(a, b) {
  // console.log(a, b);
  process.stdout.write(`${a}, ${b}: `);
}

// my algorithm
function same(a, b) {
  print(a, b)

  for (let i = 0; i < a.length; ++i) {
    const idx = b.indexOf(a[i] * a[i]);
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

console.log(same([1, 2, 3], [4, 1, 9]));
console.log(same([1, 2, 3], [1, 9]));
console.log(same([1, 2, 1], [4, 4, 1]));
console.log(same([1, 1, 1], [4, 4, 1]));
console.log(same([1, 1], [1, 1]));
console.log(same([1, 1, 1], [1, 1]));

console.log("================================")

console.log(same2([1, 2, 3], [4, 1, 9]));
console.log(same2([1, 2, 3], [1, 9]));
console.log(same2([1, 2, 1], [4, 4, 1]));
console.log(same2([1, 1, 1], [4, 4, 1]));
console.log(same2([1, 1], [1, 1]));
console.log(same2([1, 1, 1], [1, 1]));