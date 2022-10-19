import java.util.Arrays;

public class BubbleSort {
    // best case complexity O(n)
    // worst case complexity O(n2)
    // stable sorting
    // auxilary spae complexity O(1)
    public static void main(String[] args) {
        // sort the given matrix using bubble sort
        int[] arr=new int[]{1,2,3,6,5,4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        int size=arr.length-1;
        int pass=1;
        while(size>0){
            boolean swapmadeornot=false;
            for(int i=0;i<size;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    swapmadeornot=true;
                }
            }
            System.out.println("doing for pass :"+pass);
            if(!swapmadeornot)
                break;
            size-=1;
            pass+=1;
        }
    }
}
