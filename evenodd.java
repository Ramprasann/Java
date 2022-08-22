import java.util.*;

public class evenodd {
    public static void main(String args[]) {
        int number;
        int choice;
       int odd=0;
      int  even=0;
         Scanner sc=new Scanner(System.in);
        do{
            
            System.out.println("enter the no");
            number=sc.nextInt();
            if(number%2==0){
                even+=number;
            
            }
            else{
                odd+=number;
            }
            System.out.println("number=");
            choice=sc.nextInt();

        }while(choice==1);
        System.out.println(even);
        System.out.println(odd);
        sc.close();
    }
    
}
