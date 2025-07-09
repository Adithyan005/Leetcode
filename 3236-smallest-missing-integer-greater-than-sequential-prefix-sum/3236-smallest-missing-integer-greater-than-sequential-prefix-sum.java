class Solution {
    public int missingInteger(int[] nums) {
        int s=nums[0];
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]+1 == nums[i+1])
            {
                s+=nums[i+1];
            }
            else
            {
                break;
            }
        }
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        while(set.contains(s))
        {
            s++;
        }
        return s;
    }
}