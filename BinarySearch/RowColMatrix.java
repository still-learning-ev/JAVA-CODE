import java.util.Arrays;

public class RowColMatrix {
    // search in row wise and col wise sorted matrix
    public static void main(String[] args) {
        int [][] arr=new int[][]{
            {10,20,30,40},
            {11,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        int target=10;
        System.out.println(Arrays.toString(binarySearchOnRowColMatrix(arr,target)));
    
    
    }

    static int[] binarySearchOnRowColMatrix(int[][] arr, int target) {
        // we will start our search from the 0th row
        // our upper bound will be the last col
        int row=0;
        int col=arr.length-1;//if it is n*n matrix
        //upto when should we run our search
        while(row<arr.length && col>=0){
            // if the current element we are at is equal to target
            if(arr[row][col]==target)
                return new int[]{row,col};
            //we are given row and col sorted array
            //intially we are always at current rows last column
            // if the target is bigger than that element say 40
            // then it will lie somewhere below the col
            // hence we increase the row 
            if(target>arr[row][col])
                row++;
            else
                col--;
        }
        return new int[]{-1,-1};
    }

    
}
