public class incresingorderruc {
    public static void prininc(int n)
    {
        if (n==1){
            System.out.println(n+" ");
            return ;

        }
        prininc(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        int n=5;
        prininc(n);
    }
    
}
