def solution(array, commands):
  print(array)
  answer = []
  for command in commands:
    start, end, pos = command
    answer.append(sorted(array[start-1:end])[pos-1])
  return answer

print(solution([1, 5, 2, 6, 3, 7, 4], [[2, 5, 3], [4, 4, 1], [1, 7, 3]]))