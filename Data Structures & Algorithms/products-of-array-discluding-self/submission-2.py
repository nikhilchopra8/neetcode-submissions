class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prod, cnt_zero = 1, 0
        for num in nums:
            if num:
                prod *= num
            else:
                cnt_zero += 1
        
        if cnt_zero > 1:
            return [0] * len(nums)
        
        res = [0] * len(nums)
        for i, c in enumerate(nums):
            if cnt_zero: res[i] = 0 if c else prod
            else: res[i] = prod//c
        return res