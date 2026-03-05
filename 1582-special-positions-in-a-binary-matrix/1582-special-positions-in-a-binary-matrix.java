class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){

                if(mat[i][j] == 1){

                    int count1 = 0;
                    int count2 = 0;

                    
                    for(int k = 0; k < mat[0].length; k++){
                        count1 += mat[i][k];
                    }

                   
                    for(int l = 0; l < mat.length; l++){
                        count2 += mat[l][j];
                    }

                    if(count1 == 1 && count2 == 1){
                        count++;
                    }
                }
            }
        }

        return count;
    }
}