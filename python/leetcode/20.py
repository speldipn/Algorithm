class Solution:
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
print(s.isValid("()"))  # true
print(s.isValid("()[]{}"))  # true
print(s.isValid("(]"))  # false
print(s.isValid("([)]"))  # false
print(s.isValid("["))  # false
print(s.isValid("){"))  # false
print(s.isValid("(])"))  # false
