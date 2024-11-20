def solution(d, budget):
  d = sorted(list(d))
  cnt = 0
  index = 0
  while budget > 0 and index < len(d):
    if budget - d[index] >= 0: 
      budget -= d[index]
      cnt += 1
    index += 1

  return cnt

print(solution([1,3,2,5,4], 9)) # 3
print(solution([2,2,3,3], 10)) # 4
print(solution([2,2,3,1,1,2], 10)) # 4