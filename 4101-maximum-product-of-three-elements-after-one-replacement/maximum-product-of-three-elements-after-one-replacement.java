class Solution {
    public long maxProduct(int[] nums) {
        int j =0;
        for(int i : nums){
            nums[j] = Math.abs(i);
            j++;
        }
        Arrays.sort(nums);
        
        return (long) nums[nums.length-1]*nums[nums.length-2]*100000;
    }
}
