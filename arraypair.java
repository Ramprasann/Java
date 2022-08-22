public class arraypair {
    public static void pair(int num[]){
        int l=num.length-1;
        System.out.println(l);
       int tp=0;
  //  int tp=l*(l-1)/2;
        for(int i=0;i<=l;i++){
            int cur=num[i];
            for(int j=i+1;j<=l;j++){
                System.out.println("("+cur+","+num[j]+")");
             //   tp++;
            }
            
        }
        System.out.println("sum"+tp);
    }
    public static void main(String[] args) {
      int  marks[]={2,4,6 ,8,10};
      pair(marks);
    }
    
} 
