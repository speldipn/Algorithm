from collections import defaultdict

def solution(score):
  rankList = defaultdict(list)
  for index, s in enumerate(score):
    rankList[sum(s)].append(index)
  
  rankNo = 1
  result = [0 for _ in range(len(score))]
  for rank in sorted(rankList, reverse=True):
    indices = rankList[rank]
    for index in indices:
      result[index] = rankNo

    rankNo += len(indices)

  return result


# [1,2,4,3]
print(solution([[80, 70], [90, 50], [40, 70], [50, 80]]))
#  [4, 4, 6, 2, 2, 1, 7]
# print(solution([[80, 70], [70, 80], [30, 50], [90, 100], [100, 90], [100, 100], [10, 30]]))
