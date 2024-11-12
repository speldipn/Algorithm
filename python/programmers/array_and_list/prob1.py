def solution(my_str, n):
    answer = []
    i  = 0
    while i < len(my_str):
      answer.append(my_str[i:i + n])
      i += n

    return answer

print(solution("abc1Addfggg4556b", 6)) #["abc1Ad", "dfggg4", "556b"]
print(solution("abcdef123", 3)) #["abc", "def", "123"]