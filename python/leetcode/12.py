from typing import List


class Solution:

  def intToRoman(self, num: int) -> str:
    # limit: 1 ~ 3999
    digit = 1
    s = ""
    while num > 0:
      x = num % 10
      num = int(num / 10)

      if digit == 1: s = self.getOneDigit(x) + s
      if digit == 2: s = self.getTwoDigit(x) + s
      if digit == 3: s = self.getThreeDigit(x) + s
      if digit == 4: s = self.getFourDigit(x) + s

      digit += 1

    return s

  def getOneDigit(self, n: int) -> str:  # xxxn
    if n == 0: return ""
    nums = ["I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"]
    return nums[n - 1]

  def getTwoDigit(self, n: int) -> str:  # xxnx
    if n == 0: return ""
    nums = ["X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"]
    return nums[n - 1]

  def getThreeDigit(self, n: int) -> str:  # xnxx
    if n == 0: return ""
    nums = ["C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"]
    return nums[n - 1]

  def getFourDigit(self, n: int) -> str:  # nxxx
    nums = ["M", "MM", "MMM"]
    return nums[n - 1]


s = Solution()
print(s.intToRoman(3))
print(s.intToRoman(58))
print(s.intToRoman(1994))
print(s.intToRoman(1900))
