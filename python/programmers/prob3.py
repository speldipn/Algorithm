def solution(quizs):
    answer = []
    for quiz in quizs:
        tokens = quiz.split("=")
        left = calc(tokens[0].strip())
        right = int(tokens[1])
        if left == right:
            answer.append("O")
        else:
            answer.append("X")
    return answer


def calc(my_string):
    tokens = my_string.split(' ')
    nums = []
    expr = []
    for x in tokens:
        if x in ['+', '-']:
            expr.append(x)
        else:
            if x != ' ':
                nums.append(x)

    while len(expr) != 0:
        exp = expr.pop(0)
        a = int(nums.pop(0))
        b = int(nums.pop(0))
        if exp == '+':
            nums.insert(0, a + b)
        elif exp == '-':
            nums.insert(0, a - b)

    return nums.pop()

print(solution(["3 - 4 = -3", "5 + 6 = 11"]))
print(solution(["19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"]))