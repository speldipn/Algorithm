from typing import Optional, List

class Solution:
  def generateParenthesis(self, n: int) -> List[str]:
    result = set()

    for i in range(n):
      s = "(" * (n - i)
      s += ")" * (n - i - 1)
      s += "()" * i
      print(s)

    return list(result)

  def isValid(self, s: str) -> bool:
    print(f"source: {s}")
    stack = []
    ins = "([{"
    outs = ")]}"
    for p in s:
      if p in ins:
        stack.append(p)
      elif p in outs:
        if len(stack) > 0:
          _p = stack[len(stack) - 1]
          if ins.index(_p) == outs.index(p):
            stack.pop()
          else:
            return False
        else:
          return False

    return len(stack) == 0
    

s = Solution()
#print(s.generateParenthesis(1)) # 
#print(s.generateParenthesis(2)) # 
print(s.generateParenthesis(3)) # ["((()))","(()())","(())()","()(())","()()()"]
#print(s.generateParenthesis(4)) # 
#print(s.generateParenthesis(1)) # ["()"]
