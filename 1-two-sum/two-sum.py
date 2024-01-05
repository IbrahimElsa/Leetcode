class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        table = {}

        for i in range(len(nums)):
            total = target - nums[i]
            if total in table:
                return [table[target - nums[i]], i]
            table[nums[i]] = i