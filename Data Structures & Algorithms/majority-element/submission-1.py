class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        res, count = 0, 0

        for i in range(len(nums)):
            if count == 0:
                res = nums[i]
            
            if res == nums[i]:
                count += 1
            else:
                count -= 1

        return res