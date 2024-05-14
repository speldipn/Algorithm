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

function charCount2(str) {
  var result = {};
  const s = new Set(str);
  s.forEach(v => {
    const re = new RegExp(v, 'g');
    result[v] = str.match(re).length;
  });
  return result;
}

var startDate = new Date();
console.log(charCount("aaaa"));
console.log(charCount("hello"));
console.log(charCount("mynameisjoonyoungoh"));
console.log(charCount("111222333aaabbbccc111222333aaabbbccc111222333aaabbbccc"));
var endDate   = new Date();
var seconds = (endDate.getTime() - startDate.getTime()) / 1000;
console.log("udemy: ", seconds);

console.log("===========================================================");

var startDate = new Date();
console.log(charCount2("aaaa"));
console.log(charCount2("hello"));
console.log(charCount2("mynameisjoonyoungoh"));
console.log(charCount2("111222333aaabbbccc111222333aaabbbccc111222333aaabbbccc"));
var endDate   = new Date();
var seconds = (endDate.getTime() - startDate.getTime()) / 1000;
console.log("my algorithm: ", seconds);
