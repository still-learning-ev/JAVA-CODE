// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    // recursive function to calculate power of 2
    public static int solve(int n){
        
        
        //base case
        // our simple possible input
        if(n==0)
            return 1;
            
        //recursion
        int ans=solve(n-1);
        
        //what the solve function returns if it is not the base case
        // after base case is hit all the other function calls 
        // are going to return this to the calling parent function
        return ans*2;
        
    }
    
    public static void main(String[] args) {
        int n=4;
        System.out.println(solve(n));
    }
}