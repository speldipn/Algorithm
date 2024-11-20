from collections import defaultdict

def solution(emergency):
  map = defaultdict(int)
  result = [0 for _ in range(len(emergency))]
  for index, prior in enumerate(emergency):
    map[prior] = index
  rank = 1
  for idx in sorted(map, reverse=True):
    result[map[idx]] = rank
    rank += 1
  return result

print(solution([3, 76, 24])) # [3,1,2]
print(solution([1, 2, 3, 4, 5, 6, 7])) # [7, 6, 5, 4, 3, 2, 1]
print(solution([30, 10, 23, 6, 100])) # [2, 4, 3, 5, 1]
