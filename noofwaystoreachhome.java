// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    //recursive function yeh dekhne kay liye ki kitne path aise hai jisse hum ghar ponch sakte hai
    public static int totalWaysToHome(int n){
        //jab bhi hum gha ponch rahe hai to hum bolengay ki ek raasta yeh hai
        if(n==0)
            return 1;
        // agar yeh raasta humko ghar nahi leta
        if(n<0)
            return 0;
            
        // ek kadmon se banne wale raaste
        int ans1=totalWaysToHome(n-1);
        int ans2=totalWaysToHome(n-2);
        
        // hum kya return karengay ki total kinay raaste abhu tak aaye jiise n 0 bana
        return ans1+ans2;
    }
    // kitne raaste hai total main agar hum 1,2,3 size ka step lesaktay
    public static int totalWaysToHome(int n){
        //jab bhi hum gha ponch rahe hai to hum bolengay ki ek raasta yeh hai
        if(n==0)
            return 1;
        // agar yeh raasta humko ghar nahi leta
        if(n<0)
            return 0;
            
        // ek kadmon se banne wale raaste
        int ans1=totalWaysToHome(n-1);
        int ans2=totalWaysToHome(n-2);
        int ans3=totalWaysToHome(n-3);
        
        // hum kya return karengay ki total kinay raaste abhu tak aaye jiise n 0 bana
        return ans1+ans2+ans3;
    }
    // agar humko iske baraks array detay to kya karte apan
    public static int totalWaysToHome(int n,int arr[]){
        //jab bhi hum gha ponch rahe hai to hum bolengay ki ek raasta yeh hai
        if(n==0)
            return 1;
        // agar yeh raasta humko ghar nahi leta
        if(n<0)
            return 0;
            
        // ek kadmon se banne wale raaste
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int ans1=totalWaysToHome(n-arr[i]);
            ans+=ans1;
        }
        
        // hum kya return karengay ki total kinay raaste abhu tak aaye jiise n 0 bana
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("ghar jaane kay saare rastay hai : "+totalWaysToHome(6));
        System.out.println("ghar jaane kay saare rastay hai : "+totalWaysToHome(3));
        int [] arr=new int[]{1,2,3};
        System.out.println("ghar jaane kay saare rastay hai : "+totalWaysToHome(3,arr));
    }
}