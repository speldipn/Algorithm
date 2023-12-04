from typing import List
import re


class Solution:
  def longestCommonPrefix(self, strs: List[str]) -> str:
    l = len(strs[0])
    if l == 0:
      return ""

    alls = ""
    for i in range(len(strs)):
      alls += "n5e2o5" + strs[i]

    match = ""
    for i in range(l, 0, -1):
      match = strs[0][0:i]
      if len(re.findall(f'n5e2o5{match}', alls)) >= len(strs):
        break
      else:
        match = ""

    return match


s = Solution()
print(s.longestCommonPrefix(["flower", "flow", "flight"]))  # "fl"
print(s.longestCommonPrefix(["dog", "racecar", "car"]))  # ""
print(s.longestCommonPrefix(["", "racecar", "car"]))  # ""
print(s.longestCommonPrefix(["a"]))  # ""
print(s.longestCommonPrefix(["aa", "bb"]))  # ""
print(s.longestCommonPrefix(["abab", "aba", ""]))  # ""
