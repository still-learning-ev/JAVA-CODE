// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    //humko sabhi nodes ka sum nikalna hai jo bhi ek recursion tree main banay thay home wali example se
    public static int sumOfAllNodes(int n){
        //humko sabhi nodes kay values ka sum nikalna hai too hum unka value hee return karengay base case par
        if(n==0||n<0)
            return n;
            
        int ans1=sumOfAllNodes(n-1);
        int ans2=sumOfAllNodes(n-2);
        
        // nechay waaly doo ka sum 
        int ans=ans1+ans2;
        // abhi waalay node ka bhi ismain add kardo
        return ans+n;
    }
    
    public static int sumOfLeafNodes(int n){
        //humko sabhi nodes kay values ka sum nikalna hai too hum unka value hee return karengay base case par
        if(n==0||n<0)
            return n;
            
        int ans1=sumOfAllNodes(n-1);
        int ans2=sumOfAllNodes(n-2);
        
        // nechay waaly doo ka sum 
        int ans=ans1+ans2;
        // abhi waalay node ka bhi ismain add kardo
        return ans;
    }
    
    public static void main(String[] args) {
        System.out.println("recusrsion tree main sabhi nodes ka sum : "+sumOfAllNodes(3));
        
        System.out.println("recusrsion tree main end wali nodes ka sum : "+sumOfLeafNodes(3));
        
    }
}