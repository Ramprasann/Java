/* print string in reverse */
public class reverserec {
    public static void prin(String str, int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return ;
        }
        System.out.println(str.charAt(idx));
        prin(str, idx-1);
    }
    public static void main(String[] args) {
        String str= "abcd";
    
        prin(str, str.length()-1);
    }

    
}
