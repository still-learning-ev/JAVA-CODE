// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    //lineraly search for elemnts in an array using recursion
    static boolean palindrome(String str,int i, int j){
        if(i>j)
            return true;
        // 
        if(str.charAt(i)!=str.charAt(j)){
            return false;
        }
        return palindrome(str,i+1,j-1);
    }
    
    public static void main(String[] args) {
        String str="abccba";
        System.out.println(palindrome(str,0,str.length()-1));
    }
}