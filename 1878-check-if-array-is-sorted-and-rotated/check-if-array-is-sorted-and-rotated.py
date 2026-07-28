class Solution:
    def check(self, nums: List[int]) -> bool:
        if nums == sorted(nums):
            return True
        for i in range(len(nums)-1):
            if nums[i] > nums[i+1]:
                rot = nums[i+1:] + nums[:i+1] 
                return rot == sorted(nums)
        return False