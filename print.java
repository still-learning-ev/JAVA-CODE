// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    // recursive function to calculate power of 2
    public static void print(int n){
        if(n==0)
            return;
            
        print(n-1);
        System.out.println(n+" ");
        // no need to write return here because after completion of function body the function automatically returns control to parent;
        return;
    }
    
    public static void main(String[] args) {
        int n=6;
        //System.out.println(solve(n));
        print(n);
    }
}