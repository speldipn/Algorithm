def solution(arr):
  answer = []
  for n in arr:
    if len(answer) and answer[-1] == n: continue
    else: answer.append(n)
    # print(answer)

  return answer

print(solution([1,1,3,3,0,1,1])) # [1,3,0,1]
print(solution([4,4,4,3,3])) # 	[4,3]