from typing import List


class Solution:

  def letterCombinations(self, digits: str) -> List[str]:
    print(f"source: {digits}")
    letters = ["", "", "abc", "def", "ghi", "jll", "mno", "pqrs", "tuv", "wxyz"]
    result = []
    for n in digits:
      target = [*letters[int(n)]]
      if len(result) == 0:
        result = target
      else:
        newResult = []
        if len(result) >= len(target):
          for n in result:
            for _n in target:
              newResult.append(n + _n)
        else:
          for n in target:
            for _n in result:
              newResult.append(n + _n)

        result = newResult

    return result


s = Solution()
print(s.letterCombinations("23"))  # ["ad","ae","af","bd","be","bf","cd","ce","cf"]
print(s.letterCombinations(""))  # []
print(s.letterCombinations("2"))  # ["a","b","c"]
