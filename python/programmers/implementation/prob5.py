def solution(order):
    s = str(order)
    a = "369"
    count = 0
    for i in range(len(s)):
      if a.find(s[i]) != -1:
        # print("F", s[i], end=' ')
        count += 1

    return count

print(solution(3)) # 1
print(solution(29423)) # 2