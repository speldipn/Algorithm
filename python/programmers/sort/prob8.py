from collections import defaultdict, Counter

def solution(N, stages):
  result = {}
  counts = Counter(stages)
  denominator = len(stages)

  for stage in range(1, N + 1):
    if denominator:
      count = counts.get(stage, 0)
      result[stage] = count / denominator
      denominator -= count
    else:
      print(stage)
      result[stage] = 0

  return sorted(result, key=lambda x: -result[x]) 

# def solution(N, stages):
#   counts =  Counter(stages)
#   result = defaultdict(int)
#   for step in range(1, N+1):
#     trials = sum(counts.get(i,0) for i in counts.keys() if i >= step)
#     fails = counts.get(step, 0)
#     result[step] = fails/trials
#   return sorted(result, key=lambda x: -result[x]) 

  
  # trials = []
  # fails = []
  # for step in range(1, N+1):
  #   trials.append(len([user for user in stages if user >= step]))
  #   fails.append(len([user for user in stages if user == step]))

  # # print([x for x in zip(fails, trials)])

  # result = defaultdict()
  # for index, d in enumerate(zip(fails, trials)):
  #   result[index + 1] =  d[0]/d[1]

  # return sorted(result, key=lambda x: -result[x])

print(solution(5, [2, 1, 2, 6, 2, 4, 3, 3])) # [3,4,2,1,5]
print(solution(4, [4,4,4,4,4])) # [4,1,2,3]
print(solution(3, [1,2,3])) # [4,1,2,3], 0/3, 1/2, 1/3