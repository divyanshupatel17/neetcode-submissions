class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        int streak = nums.length == 0 ? 0 : 1;

        for(int num : set){
            if(!set.contains(num-1)){
                int currStreak = 1;
                int curr = num;
                while(set.contains(curr+1)){
                    currStreak++;
                    curr++;
                }
                streak = Math.max(streak, currStreak);
            }
        }

        return streak;
    }
}
