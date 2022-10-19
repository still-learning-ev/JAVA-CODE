import java.util.ArrayList;

public class PrintDiagonalElements {
    public static void main(String[] args) {
        int[][] matrix=new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(downwardDigonal(3, matrix));
    }
    static ArrayList<Integer> downwardDigonal(int n, int matrix[][])
    {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        if(n==1){
            ans.add(matrix[0][0]);
            return ans;
        }
        if(n==2){
            for(int i=0;i<n;i++){
                for(int j:matrix[i])
                    ans.add(j);
            }
            return ans;
        }
        //firstly we go in row 0 till the end of the column
        // print all the triangular elements
        for(int col=0;col<n;col++){
            int i=0;
            int j=col;
            while(i<n && j>=0){
                ans.add(matrix[i][j]);
                i++;
                j--;
            }
        }
        //when we have reached the end we see that from now onwards the column will remain same 
        // we only have to upgrade row
        for(int row=1;row<n;row++){
            int i=row;
            int col=n-1;
            while(i<n && col>=0){
                ans.add(matrix[i][col]);
                i++;
                col--;
            }
        }
        return ans;
    }
}
