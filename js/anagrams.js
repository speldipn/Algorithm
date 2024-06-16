console.log("[validAnagram]");

validAnagram("", ""); // true
validAnagram("aaz", "zza"); // false
validAnagram("anagram", "nagaram"); // true
validAnagram("rat", "car"); // false
validAnagram("awesome", "awesom"); // false
validAnagram("qwerty", "qeywrt"); //true
validAnagram("texttwisttime", "timetwisttext"); //true
validAnagram("astronomer", "moonstarer"); //true
validAnagram("listen", "silent"); //true

console.log("===========================");
console.log("[validAnagram2]");

validAnagram2("", ""); // true
validAnagram2("aaz", "zza"); // false
validAnagram2("anagram", "nagaram"); // true
validAnagram2("rat", "car"); // false
validAnagram2("awesome", "awesom"); // false
validAnagram2("qwerty", "qeywrt"); //true
validAnagram2("texttwisttime", "timetwisttext"); //true
validAnagram2("astronomer", "moonstarer"); //true
validAnagram2("listen", "silent"); //true

// My Algorithm
function validAnagram(a, b) {
  let s1 = 0;
  let s2 = 0;
  if (a.length !== b.length) {
    console.log(a, b, false);
    return;
  }
  for (let i in a) s1 += a[i].charCodeAt(0);
  for (let i in b) s2 += b[i].charCodeAt(0);
  console.log(a, b, s1 === s2);
}

// Udemy Algorithm
function validAnagram2(first, second) {
  if (first.length !== second.length) {
    console.log(first, second, false);
    return;
  }

  const lookup = {};

  for (let i = 0; i < first.length; ++i) {
    let letter = first[i];
    lookup[letter] ? (lookup[letter] += 1) : (lookup[letter] = 1);
  }
  for (let i = 0; i < second.length; ++i) {
    let letter = second[i];
    if (!lookup[letter]) {
      console.log(first, second, false);
      return;
    } else {
      lookup[letter] -= 1;
    }
  }
  console.log(first, second, true);
}
