import java.util.Scanner;
public class InfiniteLengthArray {

    public static void main(String[] args) {
        // suppose we have nums as infintie array we cant use the length
        int [] nums=new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        System.out.println("Enter the target");
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        sc.close();
        //we start bottom up building 
        //initially set the start end to 0
        
        System.out.println(range(nums,target)); 
    }

    static int range(int[] nums,int target){
        //start with the window size of 2 intially
        //keep on doubling the window size until the target does not fall in 
        // the window
        //when target falls in window ie target<end call binary search on that
        int start=0,end=1;
        while(target>end){
            //our new start will be from the end
            //because we know our targetis to right side of array
            int newstart=end+1;
            //double the window size
            end=(end-start+1)*2;
            start=newstart;
        }
        return binarySearch(nums, target, start, end);
    }
    static int binarySearch(int[] nums, int target, int start, int end) {
        //recursive approach
        if(start>end)   return -1;
        int mid=(start+end)/2;
        if(nums[mid]==target)   return mid;
        else if(target>nums[mid]){
            //search space rigth main hai start ko update karo
            start=mid+1;
            return binarySearch(nums, target, start, end);
        }else{
            //search space left main hai end ko aagay laav
            end=mid-1;
            return binarySearch(nums, target, start, end);
        }
    }
}
