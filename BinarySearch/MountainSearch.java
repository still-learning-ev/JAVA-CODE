import java.util.Scanner;

public class MountainSearch {
    //program to search an element in a mountain array
    public static void main(String[] args) {
        int[] nums=new int[] {1,5,2};

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter target");
        int target=sc.nextInt();
        sc.close();
        // we first find the peak index int the array
        int start=0,end=nums.length-1;
        int peak=findPeakIndex(nums,start,end);
        System.out.println(peak);

        // now that we have peak index we know two points
        // left side of peak is sorted in increasing order
        // right side of peak is sorted in decreasing order
        // we apply the binarysearch and agnosticbinary search
        
        int first=iterBinarySearch(nums, target, start, peak);
        if(first!=-1)
            System.out.println(first);
        else{
            int second=agnosticBinarySearch(nums, peak, end, target);
            System.out.println(second);
        }
        
    }

    static int findPeakIndex(int[] nums, int start, int end) {
        while(start<=end){
            int mid=start+(end-start)/2;
            if(start==end)
                return start;
            else if(nums[mid]<nums[mid+1])
                start=mid+1;
            else
                end=mid;
        }
        return -1;
    }

    static int iterBinarySearch(int[] nums, int target, int start, int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target) 
                return mid;
            else if(target<nums[mid])
                end=mid-1;
            else 
                start=mid+1;
        }
        return -1;
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
