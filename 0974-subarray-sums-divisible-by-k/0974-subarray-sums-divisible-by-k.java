class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int answer=0;
        int sum=0;

        HashMap<Integer,Integer> m=new HashMap<>();

        //edge case
        m.put(0,1);

        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            sum%=k;

            if(sum<0)
            {
                sum+=k;
            }
            answer+= m.getOrDefault((sum%k), 0);
            m.put(sum,(m.getOrDefault(sum,0) +1));

        }


        return answer;
    }
}