import java.util.Scanner;
// program to find the number which is >=target but the number that is 
// should be the closet number to the target
// find the smallest number greater than equal to target
class CeilNumber{
    public static void main(String[] args) {
        int [] nums=new int[]{1,2,3,5,9,14,16,18};
        System.out.println("Enter the target");
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        sc.close();
        int start=0,end=nums.length-1;
        System.out.println(binarySearch(nums,target,start,end)); 
    }
    static int binarySearch(int[] nums, int target, int start, int end) {
        //recursive approach
        int mid=(start+end)/2;
        if(start>end) {
            return start;
        } 
         
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