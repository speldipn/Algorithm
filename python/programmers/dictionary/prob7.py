from collections import defaultdict

def solution(clothes):
  print(clothes)

  map = defaultdict(int)
  for n, t in clothes:
    map[t] += 1

  result = 1 
  for m in map.values(): # [None, ....] [None, ...]
    result *= m + 1

  return result - 1 # Except [None, None,]

print(solution([["yellow_hat", "headgear"]]))
print(solution([["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]])) # 5
print(solution([["crow_mask", "face"], ["blue_sunglasses", "face"], ["smoky_makeup", "face"]])) # 3
print(solution([["crow_mask", "headgear"], ["blue_sunglasses", "face"], ["smoky_makeup", "face"]]))
print(solution([["crow_mask", "headgear"], ["crow_mask1", "headgear"], ["blue_sunglasses", "face"], ["smoky_makeup", "face"], ["clothes1", "clothes"], ["clothes2", "clothes"] ]))
print(solution([["crow_mask", "headgear"], ["blue_sunglasses", "face"], ["clothes1", "clothes"]]))