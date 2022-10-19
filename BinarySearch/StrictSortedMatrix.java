import java.util.Arrays;

public class StrictSortedMatrix {
    public static void main(String[] args) {
        // we have to search for the element in the strict sorted matrix
        int [][] matrix= new int[][]{
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int target=14;
        System.out.println(Arrays.toString(searchInSortedMatrix(matrix,target)));
    }

    static int[] searchInSortedMatrix(int[][] matrix, int target) {
        // first check if the matrix has some rows or not
        if(matrix.length==0)
            return new int[]{-1,-1};
        int rows=matrix.length;
        int cols=matrix[0].length;
        // check if we have only one row in the matrix if yes then we can 
        // use simple binary search to find our element
        if(rows==1)
            return binarySearch(matrix,rows-1,0,cols-1,target);

        // our first case is handled now is our second case
        // we can take row to elimnate cls or we can take col to elimnate row
        // let us see if we take the middleof the col ie 3/2we get mid col
        // say we are searching for 1 and we are at 6 now we can elimnate 
        // the rows below 6 because they are greter and vice versa
        int rowstart=0;// we start from 0 index
        int rowend=rows-1;// we go till all rows
        int colmid=(cols)/2;
        // now we think when are we going to stop our seacrh that is whie loop
        // when will while loop break it will break if we have only two rows left
        while(rowstart!=rowend-1){
            int rowmid=(rowstart+rowend)>>>1;
            // we check our first case if the element is equal to target
            if(matrix[rowmid][colmid]==target)
                return new int[]{rowmid,colmid};
            // we check our second condition if the elemnt is less than target
            // we ignore above rows
            if(target>matrix[rowmid][colmid])
                rowstart=rowmid;
            // if the target is small we ignore below rows
            else
                rowend=rowmid;
        }
        // loop has terminated now we are left with two rows 
        // we will search in the middle of the two rows and in the four parts
        // genrated after searching in the middle
        if(matrix[rowstart][colmid]==target)
            return new int[]{rowstart,colmid};
        if(matrix[rowstart+1][colmid]==target)
            return new int[]{rowstart+1,colmid};
        // we have four cases now if our element is less than greter than the
        // above two middles what do we do we search in the four parts
        //case 1
        if(target<=matrix[rowstart][colmid-1])
            return binarySearch(matrix, rowstart, 0,colmid-1, target);
        if(target>=matrix[rowstart][colmid+1] && target<=matrix[rowstart][cols-1])
            return binarySearch(matrix, rowstart, colmid+1, cols-1, target);
        if(target<=matrix[rowstart+1][colmid-1])
            return binarySearch(matrix, rowstart+1,0, colmid-1, target);
        if(target>=matrix[rowstart+1][colmid+1]&&target<=matrix[rowstart+1][cols-1])
            return binarySearch(matrix, rowstart+1, 0, cols-1, target);
        return new int[]{-1,-1};
    }

    private static int[] binarySearch(int[][] matrix, int row, int colstart, int colend, int target) {
        
        while(colstart<colend){
            int colmid=(colend+colstart)>>>1;
            if(matrix[row][colmid]==target)
                return new int[]{row,colmid};
            if(target>matrix[row][colmid])
                colstart=colmid+1;
            else
                colend=colmid-1;
        }
        if(colstart==colend && matrix[row][colstart]==target)
            return new int[]{row,colstart};
        
        //if the element is not found
        return new int[]{-1,-1};
    }
}
