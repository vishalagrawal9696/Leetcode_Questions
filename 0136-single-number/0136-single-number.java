class Solution {
    public int singleNumber(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            count=count^nums[i];
        }
        return count;
    }
}