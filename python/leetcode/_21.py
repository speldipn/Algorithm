from typing import Optional, List

# Definition for singly-linked list.
class ListNode:
  def __init__(self, val=0, next=None):
    self.val = val
    self.next = next

class Solution:
  def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
    result = []
    while len(list1) > 0 or len(list2) > 0:
      n = 10**10
      n1 = 10**10

      if len(list1) > 0: n  = list1[0]
      if len(list2) > 0: n1 = list2[0]

      if n <= n1: 
        result.append(n)
        list1 = list1[1:]
      else:
        result.append(n1)
        list2 = list2[1:]

    return result

s = Solution()
print(s.mergeTwoLists([], [])) # []
print(s.mergeTwoLists([], [0])) # [0]
print(s.mergeTwoLists([1,2,4], [1,3,4])) # [1,1,2,3,4,4]
