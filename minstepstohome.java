// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    // recursive function to find no of steps to go to home by taking one step at a time
    public static int stepsToHome(int n){
        // if we are already at home
        if(n==0)
            return 0;
        
        int ans=stepsToHome(n-1);//because only one step at a time
        return ans+1; // every time a step is taken it is counted
    }
    
    
    // recursive function to calculate the min number of steps required to get to home by taking one or two sized step at a time
    
    public static int minSteps(int n){
        // we are at home or we reached home exaactly
        if(n==0){
            return 0;
        }
        // if we took long steps threw us out of home
        // aise steps jisse hum gharse aage chalay gaye
        if(n<0){
            // humko minimum distance chayey to hum bolengay ki yehan poncha hee nahi jasakta matlab sabse badi distance
            return Integer.MAX_VALUE;
        }
        // ek ka step lenay se humko kitnay steps aaye
        int ans1=minSteps(n-1);
        // jab hum 2 ka step lengay to 2 minus hoga total distance mainse
        int ans2=minSteps(n-2);
        
        // humko abhi tak saare combinations mil chuke hai ghar jaane kay ek ya doo steps ka istamaal kare humko dekhna hai ki chota konsa hai oor har baar step uthanay par ek ko add karengay
        return Math.min(ans1,ans2)+1;
        
    }
    
    public static void main(String[] args) {
        int n=6;
        System.out.println("step taken to get home : "+stepsToHome(n));
        System.out.println("minimum steps to get to home by 2,1 size jump : "+minSteps(3));
    }
}