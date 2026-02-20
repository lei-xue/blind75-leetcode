class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        };
        for(int num : set){
            if(!set.contains(num-1)){
                int count = 1;
                int current = num;
                while(set.contains(current+1)){
                    count++;
                    current++;
                }
                max = Math.max(count, max);
            }
        }
        return max;

    }
}