def solution(s, skip, index):
  alphas = "abcdefghijklmnopqrstuvwxyz"
  answer = ""
  for c in s:
    idx = alphas.find(c) 
    addCount = 0
    while True:
      if alphas[idx%len(alphas)] not in skip:
        addCount += 1
        if addCount > index:
          break
      idx += 1

    answer += alphas[idx%len(alphas)]

  return answer

print(solution("aukks", "wbqd", 5)) # "happy"
print(solution("aukks", "awbqd", 5)) # "happy"