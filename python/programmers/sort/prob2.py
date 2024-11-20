from collections import Counter

def solution(X, Y):
  x = Counter(X)
  y = Counter(Y)
  answer = ""
  common = x - (x - y)
  for key, value in common.items():
    answer += key * value

  number = "".join(sorted(answer, reverse=True))

  if number.startswith("0"):
    return "0"
  elif not number:
    return "-1"
  else:
    return number

print(solution("100", "2345")) # -1
print(solution("100", "203045")) # 0
print(solution("100", "123450")) # 10
print(solution("12321", "43531")) # "321"
print(solution("5525", "1255")) # 552