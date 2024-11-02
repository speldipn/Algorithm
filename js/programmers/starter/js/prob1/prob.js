// JadenCase 
function solution(s) {
  let answer = '';
  console.log(s.length);
  const words = s.split(' ');
  for (let i = 0; i < words.length; i++) {
    if(words[i].length === 0) {
      continue;
    }
    if(!isNumber(words[i][0])) {
      answer += words[i][0].toUpperCase() + words[i].slice(1).toLowerCase();
    } else {
      answer += words[i];
    }
    if(i < words.length-1) answer += " ";
  }
  return answer;
}

var isNumber = function isNumber(value) {
  return typeof value === 'number' && isFinite(value);
}


const s1 = solution("3people unFollowed me");
console.log(`\"${s1}\"`);
const s2 = solution("for the last week");
console.log(`\"${s2}\"`);
const s3 = solution("k for  the last week for the 3ast week for the last week for the last week for the 2ast week for the last week for the last week for the last week for the 3ast week for the last week for the last week");
console.log(`\"${s3}\"`);
