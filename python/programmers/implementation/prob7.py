def solution(lottos, win_nums):
    answer = []
    validNums = list(filter(lambda n: n != 0, lottos))
    randomCnt = len(list(filter(lambda n: n == 0, lottos)))
    print(randomCnt)
    scores = { 6: 1, 5: 2, 4: 3, 3: 4, 2: 5, 1: 6, 0: 6 }
    corrects = []
    for i in range(len(validNums)):
        if validNums[i] in win_nums:
          corrects.append(validNums[i])

    print(len(corrects), randomCnt)

    answer = [scores[len(corrects)+randomCnt], scores[len(corrects)]]
    return answer


print(solution([44, 1, 0, 0, 31, 25], [31, 10, 45, 1, 6, 19])) # [3, 5]
print(solution([0, 0, 0, 0, 0, 0], [38, 19, 20, 40, 15, 25])) # [1, 6]
print(solution([45, 4, 35, 20, 3, 9], [20, 9, 3, 45, 4, 35])) # [1, 1]