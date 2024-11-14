from collections import defaultdict

def solution(genres, plays):
  categories = defaultdict(int)
  plays_record = list(plays)
  categoryItems = []
  for index, item in enumerate(zip(genres, plays)):
    catetegory, plays  = item
    categories[catetegory] += plays
    categoryItems.append((catetegory, index))

  answer = []
  categoryRank = sorted(categories, key=lambda c: -categories[c])
  for r in categoryRank:
    items = list(filter(lambda item: item[0] == r, categoryItems))
    sortedList = sorted(items, key=lambda item: -plays_record[item[1]])[:2]
    for item in sortedList:
      answer.append(item[1])

  return answer

print(solution(["classic", "pop", "classic", "classic", "pop"], [500, 600, 150, 800, 2500])) #	[4, 1, 3, 0]
print(solution(["classic", "pop"], [800, 2500])) #	[4, 1, 3, 0]
print(solution(["pop"], [800, 2500])) #	[4, 1, 3, 0]
print(solution(["classic", "pop", "classic", "classic", "pop", "robot"], [500, 600, 150, 800, 2500, 100])) #	[4, 1, 3, 0]