class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int l=-1;
        int r=-1;
        int i;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(i=1;i<n;i++)
        {
            if(nums[i]<nums[i-1])
            {
                min=Math.min(min,nums[i]);
            }
        }
        for(i=n-2;i>=0;i--)
        {
            if(nums[i]>nums[i+1])
            {
                max=Math.max(max,nums[i]);
            }
        }
        for(i=0;i<n;i++)
        {
            if(nums[i]>min)
            {
                l=i;
                break;
            }
        }
        for(i=n-1;i>=0;i--)
        {
            if(nums[i]<max)
            {
                r=i;
                break;
            }
        }
        return (l==-1) ? 0 : (r-l+1);
    }
}