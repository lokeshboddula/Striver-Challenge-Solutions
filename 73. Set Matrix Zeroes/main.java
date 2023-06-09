class Solution {
    public void setZeroes(int[][] matrix) {
        int rlength = matrix.length;
        int clength = matrix[0].length;

        //we will inplace set the first row/col to zero if we find a zero
        //we will have an overlp at pos 0,0 so we take a boolean
        boolean rowZero = false;
        //finding zeroes
        for(int i = 0; i < rlength; i++) {
            for(int j = 0; j < clength; j++) {
                if(matrix[i][j] == 0) {
                    matrix[0][j] = 0;

                    if(i > 0) matrix[i][0] = 0;
                    else rowZero = true;
                }
            }
        }

        //filling zeroes
        for(int i = 1; i < rlength; i++) {
            for(int j = 1; j < clength; j++) {
                if(matrix[0][j] == 0 || matrix[i][0] == 0)
                    matrix[i][j] = 0;
            }
        }

        if(matrix[0][0] == 0)
            for(int i = 0; i < rlength; i++)
                matrix[i][0] = 0;

        if(rowZero)
            for(int i = 0; i < clength; i++)
                matrix[0][i] = 0;
    }
}