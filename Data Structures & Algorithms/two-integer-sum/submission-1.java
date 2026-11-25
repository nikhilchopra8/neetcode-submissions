class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            int sum = nums[i];
            for(int j = i + 1; j < nums.length; j++){
                if(sum + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0};
    }
}
