// udemy 
function charCount(str) {
  const result = {};
  for(let i = 0; i < str.length; i++) {
    const char = str[i];
    if(result[char] > 0) {
      result[char]++;
    } else {
      result[char] = 1;
    }
  }
  return result;
}

// my algorithm
function charCount2(str) {
  const result = {};
  const s = new Set(str);
  s.forEach(v => {
    const re = new RegExp(v, 'g');
    result[v] = str.match(re).length;
  });
  return result;
}

// udemy second algorithm
function charCount3(str) {
  const obj = {};
  for(let i = 0; i < str.length; i++) {
    const char = str[i];
    if(/[a-zA-Z0-9]/.test(char)) {
      if(obj[char] > 0) {
        obj[char]++;
      } else {
        obj[char] = 1;
      }
    }
  }
  return obj;
}

const startDate1 = new Date();
console.log(charCount("aaaa"));
console.log(charCount("Hello"));
console.log(charCount("mynameisjoonyoungoh"));
console.log(charCount("111222333aaabbbccc111222333aaabbbccc111222333aaabbbccc"));
const endDate1 = new Date();
const seconds1 = (endDate1.getTime() - startDate1.getTime()) / 1000;

console.log("===========================================================");

const startDate2 = new Date();
console.log(charCount2("aaaa"));
console.log(charCount2("Hello"));
console.log(charCount2("mynameisjoonyoungoh"));
console.log(charCount2("111222333aaabbbccc111222333aaabbbccc111222333aaabbbccc"));
const endDate2 = new Date();
const seconds2 = (endDate2.getTime() - startDate2.getTime()) / 1000;

console.log("===========================================================");

const startDate3 = new Date();
console.log(charCount3("aaaa"));
console.log(charCount3("Hello"));
console.log(charCount3("mynameisjoonyoungoh"));
console.log(charCount3("111222333aaabbbccc111222333aaabbbccc111222333aaabbbccc"));
const endDate3 = new Date();
const seconds3 = (endDate3.getTime() - startDate3.getTime()) / 1000;
console.log(seconds1, seconds2, seconds3);