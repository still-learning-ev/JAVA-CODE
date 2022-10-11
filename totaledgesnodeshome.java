// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    //humko dekhna hai ki last main jo bhi nodes hai voh kitni thi yaa vahan kitnay raastay banay thay jissay hum ghar jaa sakay oor voh bhi jinse hum naa jaa sakay
    public static int totalNumOfNodes(int n){
        // har ek ko count karna hai too 
        if(n==0||n<0)
            return 1;
        int ans1=totalNumOfNodes(n-1);
        int ans2=totalNumOfNodes(n-2);
        
        return ans1+ans2;
    }
    public static int totalNumOfEdges(int n){
        if(n==0||n<0)
            return 1;
        int ans1= totalNumOfEdges(n-1);
        int ans2= totalNumOfEdges(n-2);
        
        return ans1+ans2+1;
    }
    public static void main(String[] args) {
        System.out.println("ghar jaane kay saare rastay hai or na jane kay : "+totalNumOfNodes(3));
        System.out.println("jitnay bhi reccursion tree main edges banay : "+totalNumOfEdges(3));
        
    }
}