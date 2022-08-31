public class decreasingoredr {
    public static void prindec(int n){

        if (n==1){

            System.out.println(n);
            return ;
        }
        System.out.println(n+" ");
        prindec(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        prindec(10);
    }

    
}
