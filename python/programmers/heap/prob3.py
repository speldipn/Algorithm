import heapq

def solution(n, works):
  works = [-work for work in works]
  heapq.heapify(works)

  for _ in range(n):
    work = heapq.heappop(works)
    if work == 0:
      break
    heapq.heappush(works, work + 1)

  return sum([work ** 2 for work in works])

print(solution(4, [4, 3, 3])) # 12
print(solution(1, [2, 1, 2])) # 6
print(solution(3, [1,1])) # 0