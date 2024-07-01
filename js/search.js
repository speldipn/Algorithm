const search = (arr, n) => {
  let start = 0;
  let end = arr.length;
  while (start < end) {
    let mid = Math.floor(start + end / 2);
    if (arr[mid] === n) {
      return mid;
    } else if (arr[mid] < n) {
      start += 1;
    } else {
      end -= 1;
    }
  }
  return -1;
};

let findIndex = search([1, 2, 3, 4, 5], 3);
console.log(`findIndex: ${findIndex}`);

findIndex = search([1, 2, 3, 5, 6, 8, 9, 12, 15, 16, 29], 1);
console.log(`findIndex: ${findIndex}`);

findIndex = search([1, 2, 3, 5, 6, 8, 9, 12, 15, 16, 29], 16);
console.log(`findIndex: ${findIndex}`);

findIndex = search([1, 2, 3, 5, 6, 8, 9, 12, 15, 16, 29], 29);
console.log(`findIndex: ${findIndex}`);

findIndex = search([1, 2, 3, 5, 6, 8, 9, 12, 15, 16, 29], 100);
console.log(`findIndex: ${findIndex}`);
