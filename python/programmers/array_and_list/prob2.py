def solution(num_list, n):
    answer = []
    ns = []
    i = 1
    while i < len(num_list) + 1:
      ns.append(num_list[i-1])
      if i > 0 and i % n == 0:
        answer.append(ns)
        ns = []
      i+=1

    if len(num_list) % n > 0:
      answer.append(num_list[len(answer)*n:])

    return answer

print(solution([1, 2, 3, 4, 5, 6, 7, 8], 2)) # [[1, 2], [3, 4], [5, 6], [7, 8]]
print(solution([100, 95, 2, 4, 5, 6, 18, 33, 948], 3)) # [[100, 95, 2], [4, 5, 6], [18, 33, 948]]
print(solution([1, 2, 3, 4, 5, 6, 7, 8], 3)) # [[1, 2], [3, 4], [5, 6], [7, 8]]
