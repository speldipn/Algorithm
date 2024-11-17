def solution(ingredient):
  answer = 0
  bowl = []
  for ing in ingredient:
    bowl.append(ing)
    if bowl[-4:] == [1,2,3,1]:
      for _ in range(4):
        bowl.pop()
      answer += 1

  return answer

print(solution([2, 1, 1, 2, 3, 1, 2, 3, 1])) # 2
print(solution([1, 3, 2, 1, 2, 1, 3, 1, 2])) # 0