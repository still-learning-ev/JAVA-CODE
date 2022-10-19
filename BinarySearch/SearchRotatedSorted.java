import java.util.Scanner;

public class SearchRotatedSorted {
    public static void main(String[] args) {
        // we have an array which is sorted then rotated by some places
        // we need to find the element in it
        // example {3,4,5,6,7,0,1,2}
        int[] nums=new int[]{3,4,5,6,7,0,1,2};
        int start=0,end=nums.length-1;
        int pivot=findPivotIndex(nums,start,end);
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        sc.close();
        // we have found pivot we will search in the both areas 
        // that is left of the pivot and right of the pivot
        // left part={3,4,5,6,7} right part={0,1,2}
        // if we found the element in the first part we will return it
        // else we will search it in the right part using binary search
        int leftPart=iterBinarySearch(nums, target, start, pivot);
        if (leftPart!=-1)
            System.out.println(leftPart);
        else
            System.out.println(iterBinarySearch(nums, target, pivot, end));
    }

    static int findPivotIndex(int[] nums, int start, int end) {
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]<nums[mid-1])
                return mid-1;
            if(nums[mid]>nums[mid+1])
                return mid;
            else if(nums[start]>nums[mid])
                end=mid;
            else start=mid+1;
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
}
