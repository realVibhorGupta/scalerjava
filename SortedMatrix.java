import java.util.Arrays;

public class SortedMatrix {


    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length; // matrix may be empty

        if (rows == 1) {
            return binarySearch(matrix, 0, 0, columns - 1, target);

        }
        int rowsStart = 0;
        int rowsEnd = rows - 1;
        int colMid = columns / 2;
        // run the lopp till all 2  the rows are remaining
        while (rowsStart < (rowsEnd - 1)) {
            int rowMid = rowsStart + (rowsEnd - rowsStart) / 2;
            if(matrix[rowMid][colMid] == target){
                return  new int[]{rowMid,colMid};
            }
            if(matrix[rowMid][colMid] < target){
                    rowsStart = rowMid;
                }else{
                rowsEnd = rowMid;
            }
        }

        //now we have Two rows
        //check weather the taget is in column of 2 rows
        if(matrix[rowsStart][colMid] == target){
            return new int[]{rowsStart,colMid};
        }
        if(matrix[rowsStart -1][colMid] == target){
            return new int[]{rowsStart+1,colMid};
        }
        //search in 1st half
        if( target<= matrix[rowsStart][colMid+1] ){
            return binarySearch(matrix,rowsStart,0,colMid-1,target);
        }
        //search in 2st half
        if( target>= matrix[rowsStart][colMid+1] && target <= matrix[rowsStart][columns-1] ){
            return binarySearch(matrix,rowsStart,colMid+1,columns-1,target);

        }
            //search in 3st half
        if( target<= matrix[rowsStart+1][colMid-1] ){
            return binarySearch(matrix,rowsStart+1,0,colMid-1,target);

        }else{
            return binarySearch(matrix,rowsStart+1,colMid+1,columns-1,target);

        }

//        return new int[]{-1,-1};
    }

    //search in rows provioded and column provided
    static int[] binarySearch(int[][] matrix, int row, int columnStart, int columnEnd, int target) {
        while (columnStart <= columnEnd) {
            int mid = columnStart + (columnEnd - columnStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                columnStart = mid + 1;
            } else {
                columnEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
                int[][] array = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                };
        System.out.println(Arrays.toString(search(array,9)));
    }
}
