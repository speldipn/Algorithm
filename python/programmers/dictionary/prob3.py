def solution(s):
  answer = []
  map = dict()
  x = set(s)
  for c in x: map[c] = -1
  for i in range(len(s)): 
    if map[s[i]] == -1:
      answer.append(-1)
    else:
      answer.append(abs(map[s[i]]-i))
      
    map[s[i]] = i

  return answer

print(solution("banana")) # [-1, -1, -1, 2, 2, 2]
print(solution("foobar")) # 	[-1, -1, 1, -1, -1, -1]
print(solution("aaa"))