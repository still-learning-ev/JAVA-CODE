

public class LongestCommonPrefix {
    //trying hash approach
    public static void main(String[] args) {
        String [] str= new String[]{"flower","flow","flightw"};
        System.out.println(longestCommonPrefix(str));
    }
    static String longestCommonPrefix(String[] strs) {
        if(strs.length==0 || strs[0].length()==0)
            return "";
        String prefix=strs[0];
        int i=1;
        while(i<strs.length){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
            i++;
        }
        return prefix;
    }
}
