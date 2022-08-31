public class sumnaturalrec {
    public static int calc(int n){
        if(n==1)
{
    return 1;
}   
int snm1=calc(n-1);
int sn= n+snm1;
return sn; 
}
public static void main(String[] args) {
    int n=5;
    System.out.println(calc(n));
}
    
}
