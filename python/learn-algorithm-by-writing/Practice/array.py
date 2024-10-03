def sum_all_items_array(arr: list[int]) -> int:
  j = 0
  for i in arr:
    if i % 2 != 0:
      break
    j += i

  print("Total sum in list {}".format(j))
  return j

print(sum_all_items_array([1,2,3,4,5]))
print(sum_all_items_array([2,4,6]))
