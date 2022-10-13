public class PeakElement {
    public static void main(String[] args) {
        int[] nums=new int[] {1,2,3,4,5,6,5,4,3,2,1};
        // as we can see we dont have monotonically increasing or dec array
        //we have bitonic array with two parts [1,2,3,4,5,6][6,5,4,3,2,1]
        // we have to apply binary search on these two arrays
        int start=0,end=nums.length-1;
        System.out.println(binarySearch(nums,  start, end));
        

    }
    static int binarySearch(int[] nums,  int start, int end) {
        //recursive approach
        //if(start>end)   return -1;
        int mid=(start+end)/2;
        //until we reach a case such that the elemnt i greater than previous
        //and less than next
        // if(nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1])
        //     return nums[mid];
        //or we can saythat whn start and end become equal
        if(start==end)
            return nums[start];
        //if the number lies in the first indreaseng part
        if(nums[mid]<nums[mid+1]){
            // we will increment start
            start=mid+1;
            return binarySearch(nums, start, end);
        }else{
            //we are in decreasing part 
            // this may be the answer but we are not sure
            // that
            end=mid;
            return binarySearch(nums, start, end);
        }
    }
}
