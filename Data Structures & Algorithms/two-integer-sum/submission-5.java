class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int diff = target - nums[i];
            if(mp.containsKey(diff) && mp.get(diff) != i){
                return new int[]{mp.get(diff), i};
            }
            mp.put(nums[i], i);
        }
        return new int[0];
    }
}
