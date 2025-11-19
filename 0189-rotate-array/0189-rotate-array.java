class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int arr[]=new int[n];
        k=k%n;
        for(int i=0;i<n;i++)
        {
            int newIndex=(i+k)%n;
           
            arr[newIndex]=nums[i];
            
        } 
         for (int i = 0; i < n; i++) 
        {
            nums[i] = arr[i];
        }
        
       
    }
}