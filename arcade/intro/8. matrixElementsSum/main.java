int matrixElementsSum(int[][] matrix) {
    int colLength = matrix[0].length;
    if (colLength == 0)
        return 0;
    int[] ghost = new int[colLength];
    int total = 0;
    for (int i = 0; i < matrix.length; i++){
        for (int j = 0; j < matrix[i].length; j++){
            int value = matrix[i][j];
            if (value == 0)
                ghost[j] = 1;
            if (ghost[j]==0)
                total = total + value;
        }
    }
    return total;
}
