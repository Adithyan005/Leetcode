class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<m.size();i++)
        {
            if(m.get(nums[i])>=2)
            {
                return true;
            }
        }
        return false;
    }
}