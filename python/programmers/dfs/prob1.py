def solution(num):
  order = 0

  if num == 1: return 0

  while True:
    order += 1

    if num % 2 == 0: num = num /2
    else: num = num * 3 + 1

    if num == 1: break

    if order >= 500: return -1

  return order

print(solution(6)) # 8
print(solution(16)) # 4
print(solution(626331)) # -1
print(solution(1)) # -1