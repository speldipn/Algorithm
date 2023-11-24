class Solution:
    def romanToInt(self, s: str) -> int:
      print(s)
      m = { 'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000 }
      _s = [m[s[0]]]
      sum = 0
      i = 1
      while i < len(s):
        v = m[s[i]]
        if _s[len(_s)-1] >= v:
          _s.append(v)
        else:
          a = _s.pop()
          _s.append(v - a)
        i += 1
      
      for i in range(len(_s)):
        sum += _s[i]

      return sum
     
s = Solution()
print(s.romanToInt("III"))
print(s.romanToInt("LVIII"))
print(s.romanToInt("MCMXCIV"))
