class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        if(low%2==0 )
        {
            low++;
        }
        while(low<=high)
        {
          if(low%2!=0)
          {
            count++;
          }
          low+=2;
        }
        return count;
    }
}