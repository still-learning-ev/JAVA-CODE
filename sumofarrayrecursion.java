// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    static int sum(int[] arr,int index){
        //base case
        if(index==0)
            return arr[0];
        int sum=arr[index]+sum(arr,index-1);
        return sum;
    }
    static int sum1(int[] arr,int size){
        if(size==0)
        return 0;
        if(size==1)
        return arr[0];
        int sum=arr[0]+sum1(Arrays.copyOfRange(arr,1,size+1),size-1);
        return sum;
    }
    public static void main(String[] args) {
        int[] arr=new int []{3,2,5,1,6};
        System.out.println(sum1(arr,arr.length));
    }
}