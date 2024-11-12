def solution(array):
  answer = 0
  for x in array:
    s = str(x)
    for i in range(len(s)):
      if int(s[i]) == 7:
        answer += 1

  return answer

print(solution([7, 77, 17])) #  4
print(solution([10, 29])) # 0