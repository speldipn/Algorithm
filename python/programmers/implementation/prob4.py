def solution(i, j, k):
    answer = ""
    for a in range(i, j+1):
      answer += str(a)

    tokens = answer.split(str(k))
    # print(answer, tokens, ''.join(tokens))

    if ''.join(tokens) == answer :
      return 0 
    else :
       return len(tokens)-1

print(solution(1, 13, 1)) # 6
print(solution(10, 50, 5)) # 5
print(solution(3, 10, 2)) # 0
print(solution(1, 10, 2)) # 0