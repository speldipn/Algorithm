def solution(s):
    answer = []
    for c in s.split(" "):
        if c == 'Z':
           answer.pop()
        else:
          answer.append(c)

    sum = 0
    for c in answer:
      if c != ' ': sum  += int(c)

    return sum

print(solution("1 2 Z 3")) # 4
print(solution("10 20 30 40")) # 100
print(solution("10 Z 20 Z 1")) # 1
print(solution("10 Z 20 Z")) # 0
print(solution("-1 -2 -3 Z")) # -3