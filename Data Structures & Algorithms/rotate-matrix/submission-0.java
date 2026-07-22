class Solution {
    public void rotate(int[][] matrix) {
        reverse(matrix);

        for(int i = 0; i < matrix.length; i++){
            for(int j = i + 1; j < matrix[i].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    private void reverse(int[][] matrix){
        int n = matrix.length;
        for(int i = 1; i < n; i++){
            int[] temp = matrix[i];
            matrix[i] = matrix[n - 1 - i];
            matrix[n - 1 -i] = temp;
        }
    }
}
