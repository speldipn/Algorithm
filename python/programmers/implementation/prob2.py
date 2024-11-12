def solution(num, total):
  answer = []
  for i in range(-total-100, total+100):
    s = getSum(i, num)
    if s == total:
      for j in range(i, i + num):
        answer.append(j)
      break

  return answer


def getSum(start, count):
  return int((start + (start + count - 1)) * (count / 2))


print(solution(3, 12))
print(solution(5, 15))
print(solution(4, 14))
print(solution(5, 5))
print(solution(2, 3))
print(solution(100, 150))