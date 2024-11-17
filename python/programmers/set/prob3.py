from collections import defaultdict

def solution(array):
  map = defaultdict(int)
  for n in array:
    map[n] += 1

  maxIndex = 0
  maxCount = 0
  for index, num in enumerate(map.values()):
    if num > maxCount:
      maxCount = num
      maxIndex = index

  dup = 0
  for n in map.values():
    if n == maxCount: dup += 1

  # print(array, map)
  # print(list(map)[maxIndex], maxCount, dup)

  if dup >= 2: return -1

  return list(map)[maxIndex]

print(solution([1, 2, 3, 3, 3, 4])) # 3
print("=====")
print(solution([1, 1, 2, 2])) # -1
print("=====")
print(solution([1])) # 1
print("=====")
print(solution([1,2,3,2])) # 1
print("=====")
print(solution([1,1,2,2])) # -1