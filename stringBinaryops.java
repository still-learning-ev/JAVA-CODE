// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.io.*;
class HelloWorld {
    static String padding(String str1, String str2){
        StringBuilder sb=new StringBuilder();
        //System.out.println(str1.compareTo(str2));
        String str="";
        if(str1.compareTo(str2)==1){
            for(int i=0;i<str1.length()-str2.length();i++){
                sb.append('0');
            }
            sb.append(str2);
            str=sb.toString();
        }
        else if(str1.compareTo(str2)==-1){
            for(int i=0;i<str2.length()-str1.length();i++){
                sb.append('0');
            }
            sb.append(str1);
            str=sb.toString();
        }
        return str;
        //System.out.println(str1+" "+str2);
    }
    static String or(String str1, String str2){
        StringBuilder sb= new StringBuilder();
        if(str1.length()<str2.length())
            str1=padding(str1,str2);
        else if(str1.length()>str2.length())
            str2=padding(str1,str2);
        System.out.println(str1+" "+str2);
        for(int i=0;i<str1.length();i++){
            //System.out.println(str1.charAt(i) +" "+ str2.charAt(i));
            if(str1.charAt(i)=='0' && str2.charAt(i)=='0'){

                sb.append('0');
            }else{
                sb.append('1');
            }
        }
        return sb.toString();
    }
    static String and(String str1, String str2){
        StringBuilder sb= new StringBuilder();
        if(str1.length()<str2.length())
            str1=padding(str1,str2);
        else if(str1.length()>str2.length())
            str2=padding(str1,str2);
        System.out.println(str1+" "+str2);
        for(int i=0;i<str1.length();i++){
            //System.out.println(str1.charAt(i) +" "+ str2.charAt(i));
            if(str1.charAt(i)=='1' && str2.charAt(i)=='1'){

                sb.append('1');
            }else{
                sb.append('0');
            }
        }
        return sb.toString();
        
    }
    static String xor(String str1, String str2){
        StringBuilder sb= new StringBuilder();
        if(str1.length()<str2.length())
            str1=padding(str1,str2);
        else if(str1.length()>str2.length())
            str2=padding(str1,str2);
        System.out.println(str1+" "+str2);
        for(int i=0;i<str1.length();i++){
            //System.out.println(str1.charAt(i) +" "+ str2.charAt(i));
            if((str1.charAt(i)=='1' && str2.charAt(i)=='0') || (str1.charAt(i)=='0' && str2.charAt(i)=='1')){

                sb.append('1');
            }else{
                sb.append('0');
            }
        }
        return sb.toString();
        
    }
    static String not(String str){
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='0')
            sb.append('1');
        else
            sb.append('0');
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println("enter numbers");
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        String str1=Integer.toBinaryString(n);
        String str2=Integer.toBinaryString(m);
        System.out.println("OR : "+or(str1,str2));
        System.out.println("AND : "+and(str1,str2));
        System.out.println("XOR : "+xor(str1,str2));
        System.out.println("NOT : "+not(str1));
        //System.out.println(str1+" "+str2);
    }
}