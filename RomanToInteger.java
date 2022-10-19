import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {
        String str="MCMXCIV";
        // str=str.replace("IX", "VIIII");
        // str=str.replace("IV", "IIII");
        // str=str.replace("XL", "XXXX");
        // str=str.replace("XC", "LXXXX");
        // str=str.replace("CD", "CCCC");
        // str=str.replace("CM", "DCCCC");
        System.out.println(romanToInt(str));
    }
    static int romanToInt(String str) {
        Map <String,Integer> map= new HashMap<>();
        map.put("I",1);
        map.put("IV",4);
        map.put("V",5);
        map.put("IX",9);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        map.put("XL",40);
        map.put("XC",90);
        map.put("CD",400);
        map.put("CM",900);
        int ans=0;
        // for(int i=0;i<str.length();i++){
        //     StringBuilder sb= new StringBuilder();
        //     sb.append(str.charAt(i));
        //     if(i<str.length()-1)
        //         sb.append(str.charAt(i+1));
        //     if(i<str.length()-1 && map.containsKey(sb.toString())){
        //             ans+=map.get(sb.toString());
        //             i++;
        //     }else{
        //         int x=map.get(Character.toString(str.charAt(i)));
        //         ans+=x;
        //     }
        // }
        int prev=0;
        for(int i=0;i<str.length();i++){
            int current=map.get(Character.toString(str.charAt(i)));
            if(prev==1 && current==5 || prev==1 && current==10||
                prev==10 && current==50||prev==10 && current==100||
                prev==100 && current==500||prev==100 && current==1000)
                ans-=2*prev;
            ans+=current;
            prev=current;
        }
        return ans;
    }
}
