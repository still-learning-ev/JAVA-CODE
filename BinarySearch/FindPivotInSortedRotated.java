public class FindPivotInSortedRotated {
    public static void main(String[] args) {
        // we have an array which is sorted then rotated by some places
        // we need to find the element in it
        // example: {3,4,5,6,7,0,1,2};
        // in example we have two ascending arrarys{3,4,5,6,7}{0,1,2}
        // but we have one descending too{7,0}
        int[] nums=new int[]{3,4,5,6,7,0,1,2};
        int start=0,end=nums.length-1;
        int peak=findPivotIndex(nums,start,end);
        System.out.println("pivot :"+peak);
    }

    static int findPivotIndex(int[] nums, int start, int end) {
        while(start<=end){
            int mid=(start+end)/2;
            //in case of our descending array {7,0}
            //if nums[mid]==0 then the nums[mid-1] which is seven is greater
            if(nums[mid]<nums[mid-1])
                return mid-1;
            // if we have mid elemnt as 7 itself then it is greater than 0
            // hence we can return mid here
            if(nums[mid]>nums[mid+1])
                return mid;
            // consider we have mid in{0,1,2} part and start in{3,4,6,7}
            // we want to find the maximum elemnt we would not like to 
            // goto {0,1,2} hence do mid-1
            else if(nums[start]>nums[mid])
                end=mid-1;
            else start=mid+1;
            //esle part in normal in binarySearch of ascending order
        }
        return -1;
    }
}
