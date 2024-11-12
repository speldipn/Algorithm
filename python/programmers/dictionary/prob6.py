# 1) No repeat keyword in array
# 2) At first sorted (similar one and after one) if one keyword matched, exit loop!

def solution(phone_book):
  books = sorted(phone_book)
  for i in range(len(books) - 1):
    if books[i + 1].startswith(books[i]):
      return False

  return True

print(solution(["119", "97674223", "1195524421"])) # false
print(solution(["123","456","789"])) # true
print(solution(["12","123","1235","567","88"])) # false