import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr=new int[]{10,8,9,5,7,6,4,3,2,1};
        int size=arr.length-1;
        for(int i=0;i<arr.length;i++){
            int max=Integer.MIN_VALUE;
            int maxindex=0;
            for(int j=0;j<=size;j++){
                if(max<arr[j]){
                    max=arr[j];
                    maxindex=j;
                }
            }
            int temp=arr[size];
            arr[size]=max;
            arr[maxindex]=temp;
            size--;
            //System.out.println(maxindex+" "+max);
            
        }
        System.out.println(Arrays.toString(arr));
    }

    static int[] findMaxInRange(int[] arr, int start, int length) {
        int max=arr[0];
        int maxindex=0;
        
        for(int i=0;i<=length;i++){
            if(max<arr[i]){
                max=arr[i];
                maxindex=i;
            }
        }
        
        return new int[]{maxindex,max};
    }

}
