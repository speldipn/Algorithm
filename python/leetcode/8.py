class Solution:
  def myAtoi(self, n: str) -> int:
    a = ""
    s = n.strip()
    print("s:", s, end=' ')
    for i in range(len(s)):
      if type(s[i]) is str and s[i].isnumeric():
        a += s[i]
      elif s[i] == '-' or s[i] == '+':
        if len(a) > 0 and (a[0] == '+' or a[0] == '-'):
         # a = s[i] + s[i+1:i+1]
         # a = ""
          break
        else:
          if len(a) > 0: 
            #a = ""
            break
          a = s[i] + a
      elif s[i] == ' ':
        if len(a) > 0:
          break
        continue
      else:
        break

    if len(a) == 0:
      print("\nresult:", 0)
      return 0
    else:
      _s = a.strip()
      if not _s[len(_s)-1].isnumeric():
        _s += "0"
      v = int(_s)
      print("\nresult:", v)
      if v < -2147483648:
        return -2147483648
      elif v > 2147483647:
        return 2147483647
      else:
        return v

s = Solution()
s.myAtoi("42")
s.myAtoi("     -42")
s.myAtoi("4193 with words")
s.myAtoi("words and 987")
s.myAtoi("-+12")
s.myAtoi("+-12")
s.myAtoi("00000-42a1234")
s.myAtoi("   +0 123")
s.myAtoi("0-1")
s.myAtoi("0  123")
s.myAtoi("-5-")
s.myAtoi("123-")
