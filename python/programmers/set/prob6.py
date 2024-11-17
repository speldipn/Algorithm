from collections import defaultdict

def solution(id_list, rs, k):
    report = set()
    for r in rs:
       report.add(r)

    answer = []
    user_report = defaultdict(list)
    report_counts = defaultdict(int)
    for report_list in report:
      u, r = report_list.split(" ")
      user_report[u] += [r]
      report_counts[r] += 1

    for user in id_list:
      reports = user_report[user]
      report_count = 0
      for report in reports:
         if report_counts[report] >= k:
            report_count += 1

      answer.append(report_count)

    return answer

print(solution(["muzi", "frodo", "apeach", "neo"], ["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"], 2)) # [2,1,1,0]
print(solution(["con", "ryan"], ["ryan con", "ryan con", "ryan con", "ryan con"], 3)) # [0,0]