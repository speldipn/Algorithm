def solution(babbling):
  print(babbling)
  answer = 0
  pron = ["aya", "ye", "woo", "ma"]
  for word in babbling:
      target = word
      for p in pron:
          if p in target:
              target = target.replace(p, str(pron.index(p)))
      isOk = True
      for t in target:
          x = str(t)
          if not x.isnumeric():
              isOk = False
              break
      if isOk:
        i = 0
        while i < len(target):
          if i + 1 < len(target) and target[i] == target[i+1]:
             break
          i += 1
        if i == len(target):
          answer += 1
  
  return answer

print(solution(["aya", "yee", "u", "maa"])) # 1
print(solution(["ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"])) # 2