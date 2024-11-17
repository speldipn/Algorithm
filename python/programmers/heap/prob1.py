def solution(k, score):
  answer = []
  time = 0
  rank = []
  while time < len(score):
    rank.append(score[time])
    rank = sorted(rank, key=lambda r: -r)
    if len(rank) < k: answer.append(rank[-1])
    else: answer.append(rank[k-1])
    time += 1
  return answer

print(solution(3, [10, 100, 20, 150, 1, 100, 200])) # [10, 10, 10, 20, 20, 100, 100] 
print(solution(4, [0, 300, 40, 300, 20, 70, 150, 50, 500, 1000])) # [0, 0, 0, 0, 20, 40, 70, 70, 150, 300]