def solution(my_string, num1, num2):
  a = my_string[num1]
  b = my_string[num2]
  s = my_string[:num1] + b + my_string[num1+1: num2] + a + my_string[num2+1:]
  return s

print(solution("hello", 1, 2),solution("hello", 1, 2) == "hlelo" )
print(solution("I love you", 3, 6), solution("I love you", 3, 6) == "I l veoyou")
