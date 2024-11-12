def solution(array):
  max = [-1, -1]
  for i in range(len(array)):
    if array[i] > max[0]:
        max = [array[i], i]

  return max

print(solution([1, 8, 3])) # [8, 1]
print(solution([9, 10, 11, 8])) # [11, 2]