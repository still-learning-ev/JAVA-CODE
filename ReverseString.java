public class ReverseString {
    public static void main(String[] args) {
        String str="zeeshan";
        System.out.println(stringReverse(str.toCharArray()));
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse().toString());
    }

    static String stringReverse(char[] str) {
        int start=0,end=str.length-1;
        while(start<end){
            char tmp=str[start];
            str[start]=str[end];
            str[end]=tmp;
            start++;
            end--;
        }
        return new String(str);
    }
}
