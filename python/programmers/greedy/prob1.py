def solution(hp):
  # 5 3 1
  a = hp // 5
  b = (hp % 5) // 3
  c = ((hp % 5) % 3)
  return a + b + c

print(solution(23)) # 5
print(solution(24)) # 6
print(solution(999)) # 201