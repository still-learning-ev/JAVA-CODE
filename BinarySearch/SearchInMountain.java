public class SearchInMountain {
    public static void main(String[] args) {
        int[] nums=new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2
    };
        // as we can see we dont have monotonically increasing or dec array
        //we have bitonic array with two parts [1,2,3,4,5,6][6,5,4,3,2,1]
        // we have to apply binary search on these two arrays
        int target=22;
        int start=0,end=nums.length-1;
        int peak=binarySearch(nums,  start, end);
        if(target==nums[peak])
            System.out.println(peak);
        else{
            System.out.println(peak);
            System.out.println(search1(nums,peak+1,nums.length-1,target));
            System.out.println(search(nums,0,peak-1,target));
        }

        

    }
    static int search(int[] nums,int start,int end,int target){
        if(start>end)   return -1;
        int mid=(start+end)/2;
        if(nums[mid]==target)   return mid;
        else if(target>nums[mid]){
            //search space rigth main hai start ko update karo
            start=mid+1;
            return search(nums, start, end,target);
        }else{
            //search space left main hai end ko aagay laav
            end=mid-1;
            return search(nums, start, end,target);
        }
    }
    static int search1(int[] nums,int start,int end,int target){
        //if(start>end)   return -1;
        int mid=(start+end)/2;
        if(nums[mid]==target)   return mid;
        else if(target<nums[mid]){
            //search space rigth main hai start ko update karo
            start=mid+1;
            return search(nums,  start, end,target);
        }else{
            //search space left main hai end ko aagay laav
            end=mid-1;
            return search1(nums,  start, end,target);
        }
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
        // we are goint to return the index of peak elemnt
        if(start==end)
            return start;
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
