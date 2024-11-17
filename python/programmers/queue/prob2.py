def solution(progresses, speeds):
  answer = []
  time = 0
  count = 0
  while progresses:
    if progresses[0] + speeds[0] * time >= 100:
      progresses.pop(0)
      speeds.pop(0)
      count += 1
    else:
      if count:
        answer.append(count)
        count = 0
      time += 1

  answer.append(count)
  return answer

print(solution([93, 30, 55], [1, 30, 5])) # [2,1]
print(solution([95, 90, 99, 99, 80, 99], [1, 1, 1, 1, 1, 1])) # [1,3,2]
print(solution([93, 30, 55], [1,8,10])) # [1, 2]