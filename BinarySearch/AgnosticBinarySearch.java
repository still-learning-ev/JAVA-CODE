import java.util.Scanner;

public class AgnosticBinarySearch {
    public static void main(String[] args) {
        // binary search on decreasing sorted array
        int[] nums=new int[]{7,6,5,4,3,2,1};
        int start=0,end=nums.length-1;
        System.out.println("enter key to search");
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        sc.close();
        System.out.println(agnosticBinarySearch(nums,start,end,target));
    }

    static int agnosticBinarySearch(int[] nums, int start, int end, int target) {
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target)
                return mid;
            else if(target<nums[mid]){
                //search space lies to the right so we need to update start pointer
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

    

}
