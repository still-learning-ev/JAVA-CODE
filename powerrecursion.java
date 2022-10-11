// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    //lineraly search for elemnts in an array using recursion
    static int power(int n){
        //find 2^n using rec
        //base case
        if(n==0)
            return 1;
        int ans=2*power(n-1);
        return ans;
    }
    static int power2(int a, int b){
        if(b==0)
         return 1;
        int ans=a*power2(a,b-1);
        return ans;
    }
    static int power3(int a,int b){
        if(b==0)
        return 1;
        if(b==1)
        return a;
        int ans=power3(a,b/2);
        if(b%2==0)
            return ans*ans;
        else
            return a*ans*ans;
    }
    public static void main(String[] args) {
        System.out.println(power3(2,5));
    }
}