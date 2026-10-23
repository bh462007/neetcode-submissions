class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
      
        //mark first row and column 
        boolean firstrow=false;
        boolean firstcol=false;

        for(int i=0;i<rows;i++){
            if(matrix[i][0]==0){
                firstcol=true;
            }
        }
        for(int j=0;j<cols;j++){
            if(matrix[0][j]==0){
                firstrow=true;
            }
        }

        //mark rows and columns
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        //actually make them zero
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }

        //handle the first row and column
        if(firstrow){
            for(int j=0;j<cols;j++){
                matrix[0][j]=0;
            }
        }
        if(firstcol){
            for(int i=0;i<rows;i++){
                matrix[i][0]=0;
            }
        }

    }
}
