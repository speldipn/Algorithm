def solution(before, after):
  answer = 0
  _after = list(after)
  for c in before:
    if c in _after:
      _after.remove(c)

  return 1 if len(_after) == 0 else 0

print(solution("olleh", "hello")) # 1
print(solution("allpe", "apple")) # 0