import java.util.Scanner;

class BinarySearch{

    public static void main(String[] args){
        int [] nums=new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println("Enter the target");
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        sc.close();
        int start=0,end=nums.length-1;
        System.out.println(binarySearch(nums,target,start,end)); 
        System.out.println(iterBinarySearch(nums,target,start,end));
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