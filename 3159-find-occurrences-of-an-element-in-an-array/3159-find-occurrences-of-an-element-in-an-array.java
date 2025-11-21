class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int N=nums.length;
        int M=queries.length;

        int answer[]=new int[M];
        HashMap<Integer,ArrayList<Integer>> m=new HashMap<>();
        
        for(int i=0;i<N;i++)
        {
            if(m.containsKey(nums[i]))
            {
               m.get(nums[i]).add(i);
            }
            else 
            {
              ArrayList<Integer> arr=new ArrayList<>();
              arr.add(i);
              m.put(nums[i],arr);
            }
        }
        for(int i=0;i<M;i++)
        {
           if(!m.containsKey(x) || (queries[i]>m.get(x).size()))
           {

            answer[i]=-1;

           }
           else
           {
             answer[i]=m.get(x).get(queries[i]-1);
           }          
        }

        return answer;
    }
}