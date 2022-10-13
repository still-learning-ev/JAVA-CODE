import java.util.*;
import java.io.*;
// program to find substrings of the string
class HelloWorld {
    static void finSubStrings(String str){
        ArrayList<String> ans= new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char[] temp= new char[str.length()];
            int tempindex=0;
            for(int j=i;j<str.length();j++){
                temp[tempindex]=str.charAt(j);
                tempindex++;
                //temp[tempindex]='\0';
                String s=new String(temp);
                ans.add(s.trim());
            }
            
        }
        for(String s:ans){
            System.out.println(s.length()+ "  "+s);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("All substrings of a String");
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        // call substring printing
        finSubStrings(str);
    }
}