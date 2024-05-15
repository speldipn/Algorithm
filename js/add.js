// udemy 
function charCount(str) {
  var result = {};
  for(var i = 0; i < str.length; i++) {
    var char = str[i];
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
  var result = {};
  const s = new Set(str);
  s.forEach(v => {
    const re = new RegExp(v, 'g');
    result[v] = str.match(re).length;
  });
  return result;
}

// udemy second algorithm
function charCount3(str) {
  var obj = {};
  for(var i = 0; i < str.length; i++) {
    var char = str[i].toLowerCase();
    if(/[a-z0-9]/.test(char)) {
      if(obj[char] > 0) {
        obj[char]++;
      } else {
        obj[char] = 1;
      }
    }
  }
  return obj;
}

var startDate = new Date();
console.log(charCount("aaaa"));
console.log(charCount("hello"));
console.log(charCount("mynameisjoonyoungoh"));
console.log(charCount("111222333aaabbbccc111222333aaabbbccc111222333aaabbbccc"));
var endDate   = new Date();
var seconds1 = (endDate.getTime() - startDate.getTime()) / 1000;

console.log("===========================================================");

var startDate = new Date();
console.log(charCount2("aaaa"));
console.log(charCount2("hello"));
console.log(charCount2("mynameisjoonyoungoh"));
console.log(charCount2("111222333aaabbbccc111222333aaabbbccc111222333aaabbbccc"));
var endDate   = new Date();
var seconds2 = (endDate.getTime() - startDate.getTime()) / 1000;

console.log("===========================================================");

var startDate = new Date();
console.log(charCount3("aaaa"));
console.log(charCount3("hello"));
console.log(charCount3("mynameisjoonyoungoh"));
console.log(charCount3("111222333aaabbbccc111222333aaabbbccc111222333aaabbbccc"));
var endDate   = new Date();
var seconds3 = (endDate.getTime() - startDate.getTime()) / 1000;
console.log(seconds1, seconds2, seconds3);
