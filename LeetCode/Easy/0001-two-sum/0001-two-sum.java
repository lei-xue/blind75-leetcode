class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int seed = target - nums[i];
            if(map.containsKey(seed)){
                return new int[]{map.get(seed), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}