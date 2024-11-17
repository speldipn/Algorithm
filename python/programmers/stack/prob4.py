def solution(s):
  tack = []
  for c in s:
    tack.append(c)
    if len(tack) > 1 and tack[-1] == ')':
      if tack[-2] == '(':
        for _ in range(2): tack.pop()

  if len(tack) == 0: return True
      
  return False

print(solution("()()")) # true
print(solution("(())()")) # true
print(solution(")()(")) # false
print(solution("(()(")) # false