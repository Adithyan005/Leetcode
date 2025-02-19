class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<right)
        {
            int mid = (left + right)/2;
            if(nums[mid]>nums[right])
            {
                if(target>=nums[left] && target<=nums[mid])
                {
                    right = mid;
                }
                else{
                    left = mid+1;
                }
            }
            else if(nums[mid]<nums[right])
            {
                if(target>nums[mid] && target<=nums[right])
                {
                    left = mid+1;
                }
                else{
                    right = mid;
                }
            }
            else{
                right--;
            }    
        }
        return nums[left]==target;
    }
}