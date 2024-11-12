def solution(wallpaper):
    m = makeMap(wallpaper)
    printMap(m)
    x1, y1  = 100, 100
    x2, y2 = -1, -1
    for i in range(len(m)):
      for j in range(len(m[0])):
        if m[i][j] == '#':
          if i < x1:
            x1 = i
          if i > x2:
            x2 = i
          if j < y1:
            y1 = j
          if j > y2:
            y2 = j

    return [x1, y1, x2+1, y2+1]

def makeMap(data):
  map = []
  for i in range(len(data)):
    a = []
    for j in range(len(data[0])):
      a.append(data[i][j])
    map.append(a)
  return map

def printMap(data):
  for i in range(len(data)):
    for j in range(len(data[0])):
      print(data[i][j], end=' ')
    print()

print(solution([".#...", "..#..", "...#."])) 
#	[0, 1, 3, 4]

print(solution(["..........", ".....#....", "......##..", "...##.....", "....#....."])) 
# [1, 3, 5, 8]

print(solution([".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."]))
# [0, 0, 7, 9]

print(solution(["..", "#."])) 
# [1, 0, 2, 1]
