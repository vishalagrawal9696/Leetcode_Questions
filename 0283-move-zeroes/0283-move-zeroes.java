class Solution {
    public void moveZeroes(int[] nums) {
       int n=nums.length;
       int i=0; //move in array
       int j=0; // place non-zero integer

       while(i<n)
       {
        if(nums[i]!=0)
        {
            nums[j]=nums[i];
            j++;
        }

        i++;
       }
       while(j<n)
       {
        nums[j]=0;
        j++;
       }
    }
}