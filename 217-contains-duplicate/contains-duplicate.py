class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        table = set()
        for i, num in enumerate(nums):
            if num in table:
                return True
            table.add(num)
        return False
                