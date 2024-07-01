// 240701. failure

function findLongestSubstring(str) {
  let i = 0;
  let j = 0;
  let result = "";
  let max = 0;
  while(j < str.length) {
    if(result.includes(str[i])) {
      console.log(result);
      if(result.length > max) {
        max = result.length;
      }
      result = str[i]
    } else {
      result += str[i];
    }
    i++;
    j++;
  }
  console.log(str, max);
  return max;
}

findLongestSubstring('') // 0
findLongestSubstring('rithmschool') // 7
findLongestSubstring('thisisawesome') // 6
// findLongestSubstring('thecatinthehat') // 7
// findLongestSubstring('bbbbbb') // 1
// findLongestSubstring('longestsubstring') // 8
// findLongestSubstring('thisishowwedoit') // 6