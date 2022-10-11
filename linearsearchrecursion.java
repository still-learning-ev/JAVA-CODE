// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    //lineraly search for elemnts in an array using recursion
    static boolean search(int [] arr, int key,int index){
        // base case
        //if we have exhausted the array
        if(index==0){
        //if elemnt is present at index 0
            if(arr[0]==key)
                return true;
            else
                return false;
        }
        // now that we make our problem less by one each time we can say we have remaining n-1 elements to search from
        if(arr[index]!=key)
            return search(arr,key,index-1);
        else
            return true;
    }
    //method two
    static boolean search1(int [] arr, int key,int size){
        // base case
        //if we have exhausted the array there is no element
        if(size==0)
            return false;
        if(arr[0]==key)
            return true;
        else
            return search1(Arrays.copyOfRange(arr,1,size+1),key,size-1);
        
    }
    
    public static void main(String[] args) {
        int[] arr=new int []{3,2,5,1,6};
        System.out.println(search1(arr,3,arr.length));
    }
}