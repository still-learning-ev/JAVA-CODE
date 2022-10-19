import java.util.Scanner;

class PerfectSquare{
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        System.out.println(isPerfectSquare(num,1,num));
    }
    static int isPerfectSquare(int num ,int start, int end){
        // our search space is start to end
        while(start<=end){
            int mid =start+(end-start)/2;
            if(mid*mid==num)
                return mid;
            else if((mid*mid)<num)
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
}