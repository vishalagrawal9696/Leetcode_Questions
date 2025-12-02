class Solution {
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
    public int maximalRectangle(char[][] matrix) {
        int N=matrix.length;
        int M=matrix[0].length;

        int arr[][]=new int[N][M];

        for(int i=0;i<M;i++)
        {
            int sum=0;
            for(int j=0;j<N;j++)
            {
             if(matrix[j][i]=='1')
             {
                sum++;
             }
             else
             {
                sum=0;
                
             }
             arr[j][i]=sum;
            }
        }
        int maxArea=0;
        for(int i=0;i<N;i++)
        {
            int area=largestRectangleArea(arr[i]);
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }
}