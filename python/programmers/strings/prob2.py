def solution(my_string):
    print(my_string)
    tokens = my_string.split(' ')
    nums = []
    expr = []
    for x in tokens:
        if x in ['+', '-']:
            expr.append(x)
        else:
            if x != ' ':
                nums.append(x)

    print(nums, expr)
    while len(expr) != 0:
        exp = expr.pop(0)
        a = int(nums.pop(0))
        b = int(nums.pop(0))
        if exp == '+':
            nums.insert(0, a + b)
        elif exp == '-':
            nums.insert(0, a - b)

    return nums.pop()

print("answer:", solution("3 + 4"))
print("answer:", solution("1 - 3"))
print("answer:", solution("5 + 2 - 3"))
