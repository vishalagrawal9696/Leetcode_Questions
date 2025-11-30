class Solution {
    //fint the next smaller element in the given array
    public int[] nextSmallerLeft(int[]heights)
    {
       int N=heights.length;
       int answer[]=new int[N];
       for(int i=0;i<N;i++)
       {
           answer[i]=-1;
       }
       Stack<Integer>st=new Stack<>();
       for(int i=N-1;i>=0;i--)
       {
         while(!st.isEmpty() && heights[i]<heights[st.peek()] )
         {
            answer[st.peek()]=i;
            st.pop();
         }
         st.push(i);
       }
       return answer;
    }
    public int[] nextSmallerRight(int[]heights)
    {
       int N=heights.length;
       int answer[]=new int[N];
       for(int i=0;i<N;i++)
       {
           answer[i]=N;
       }
       Stack<Integer>st=new Stack<>();
       for(int i=0;i<N;i++)
       {
         while(!st.isEmpty() && heights[i]<heights[st.peek()] )
         {
            answer[st.peek()]=i;
            st.pop();
         }
         st.push(i);
       }
       return answer;
    }

    public int largestRectangleArea(int[] heights) {
        int N=heights.length;
        int left[]=nextSmallerLeft(heights);
        int right[]=nextSmallerRight(heights);

        int answer=0;

        for(int i=0;i<N;i++)
        {
           int width=right[i]-left[i]-1;
           int area=heights[i]*width;
           
           answer=Math.max(answer,area);

        }
        return answer;
    }
}