class Solution {
    public int findPairs(int[] nums, int k) {
        Set <Integer> vis = new HashSet<>();
        Set <Integer> unique = new HashSet<>();
        
        for(int r:nums)
        {
            if(vis.contains(r-k))
            {
                unique.add(r-k);
            }
            if(vis.contains(r+k))
            {
                unique.add(r);
            }
            vis.add(r);
        }
        return unique.size();
    }
}