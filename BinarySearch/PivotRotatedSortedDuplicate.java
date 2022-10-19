public class PivotRotatedSortedDuplicate {
    public static void main(String[] args) {
        int [] arr=new int[]{2,2,9,2,2,2};
        System.out.println(pivotInRotatedSortedArrayWithDuplicates(arr,0,arr.length-1));
        
    }

    static int pivotInRotatedSortedArrayWithDuplicates(int[] arr, int start, int end) {
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
                return mid;
            if(mid>start && arr[mid]<arr[mid-1])
                return mid-1;
            if(arr[mid]==arr[end] && arr[mid]==arr[start]){
                //we skip the elements but if they are pivots what do we do
                if(arr[start]>arr[start+1])
                    return start;
                start++;
                if(arr[end-1]>arr[end])
                    return end-1;
                end--; 
            }
            
        }
        return -1;
    }
}
