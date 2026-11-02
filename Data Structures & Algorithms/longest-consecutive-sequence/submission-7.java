class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        // <number , seq-length>
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            // skip duplicate
            if(map.containsKey(num)) continue;

            int left = map.getOrDefault(num-1,0);
            int right = map.getOrDefault(num+1,0);
            int len = left + 1 + right;
            map.put(num,len);
            map.put(num-left,len);
            map.put(num+right,len);

            longest = Math.max(len, longest);
        }

        return longest;
    }
}
