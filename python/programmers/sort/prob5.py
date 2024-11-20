def solution(array, n):
  closest = float('inf')
  for num in array:
    if abs(num - n) < abs(closest - n):
      closest = num
    elif abs(num - n) == abs(n - closest):
      closest = min(num, closest)

  return closest

print(solution([3,10,28], 20))  # 28
print(solution([10,11,12], 5)) # 12
print(solution([1], 0)) # 1
print(solution([10,13,14], 12)) # 13
print(solution([1,100], 51)) # 100
print(solution([4,6], 5)) # 4