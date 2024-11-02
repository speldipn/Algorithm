def solution(n):
  s = str(n)
  sum = 0
  idx = 0
  while idx < len(s):
    sum += int(s[idx])
    idx += 1
  
  answer = sum
  return answer

print(solution(1234),solution(1234) == 10)
print(solution(930211), solution(930211) == 16)