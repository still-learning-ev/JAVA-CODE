// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    static void bubbleSort(int[] arr,int size){
        //base case if size is zero
        if(size==0 || size==1)
            return;
            
        //solve one case of swapping
        for(int i=0;i<size-1;i++){
            int tmp=0;
            if(arr[i]>arr[i+1]){
                tmp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=tmp;}
        }
        bubbleSort(arr,size-1);
    }
    public static void main(String[] args) {
        int [] arr=new int[]{2,6,3,1,0,9,5};
        bubbleSort(arr,arr.length);
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
}