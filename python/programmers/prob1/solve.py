def solution(players, callings):
  answer = []
  ranking = []
  for i in range(0, len(players)): ranking.append(len(players)-i)
  for i in range(0, len(callings)): ranking[players.index(callings[i])] += 1
  for i in range(0, len(ranking)):
    src = ranking[i]
    target = 0
    for j in range(i+1, len(ranking)):
      dest = ranking[j]
      if src <= dest:
        target = j

    if target != 0: answer.append(players[target])
    else: 
      if players[i] in answer:
        answer.append(players[answer.index(players[i])])
      else:
        answer.append(players[i])

  return answer

players = ["mumu", "soe", "poe", "kai", "mine"] # [5,4,3,2,1]
callings = ["kai", "kai", "mine", "mine"]
results = solution(players, callings)
print(results)

for idx, player in enumerate(players):
  print(idx, player)
