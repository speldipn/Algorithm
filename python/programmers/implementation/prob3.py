def solution(chicken):
  print(chicken, end=" ")
  count = 0
  while True:
    coupon = chicken // 10
    count += coupon
    chicken = coupon + chicken % 10

    if not coupon: 
      break

  return count

for i in range(0, 11):
  print(solution(i))

print(solution(100)) # 11
print(solution(190)) # 21
print(solution(200)) # 22 
print(solution(1000)) # 
print(solution(1081)) # 120
print(solution(10081)) # 120