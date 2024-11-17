import heapq

def solution(scoville, K):
  time = 0
  scoville = sorted(scoville)
  while any(K > s for s in scoville):
    if len(scoville) < 2: 
      return -1

    # scoville = sorted(scoville)
    a = heapq.heappop(scoville)
    b = heapq.heappop(scoville)
    heapq.heappush(scoville, a + b * 2)
    time += 1
  
  return time

print(solution([1, 2, 3, 9, 10, 12], 7)) # 2
print(solution([1, 1, 1], 100)) # 2