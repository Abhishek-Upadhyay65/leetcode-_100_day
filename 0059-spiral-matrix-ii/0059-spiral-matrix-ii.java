
class Solution {
    public int[][] generateMatrix(int n) {
        int nums[][] = new int[n][n];

        int startRow = 0;
        int startCol = 0;
        int endRow = n - 1;
        int endCol = n - 1;
        int m = 1;

        while(startRow <= endRow && startCol <= endCol) {

            // Top
            for(int j = startCol; j <= endCol; j++) {
                nums[startRow][j] = m++;
            }

            // Right
            for(int i = startRow + 1; i <= endRow; i++) {
                nums[i][endCol] = m++;
            }

            // Bottom
            if(startRow < endRow) {
                for(int j = endCol - 1; j >= startCol; j--) {
                    nums[endRow][j] = m++;
                }
            }

            // Left
            if(startCol < endCol) {
                for(int i = endRow - 1; i > startRow; i--) {
                    nums[i][startCol] = m++;
                }
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        return nums;
    }
}
