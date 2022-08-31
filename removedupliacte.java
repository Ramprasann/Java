/* remove the duplicate the string  */
public class removedupliacte {
    public static void duplicate(String str, int idx , StringBuilder newstr, boolean[] bs){
        if(idx==str.length()){
            System.out.println(newstr);
            return ;

        }
        char currchar=str.charAt(idx);
        if(bs[currchar-'a'] == true){
            duplicate(str, idx+1, newstr, bs);
     
        }else{
            bs[currchar-'a']=true;
            duplicate(str, idx, newstr.append(currchar), bs);
        }
    }
    public static void main(String[] args) {
        String str= "appnacollege";
         duplicate(str, 0, new StringBuilder(" "),  new boolean[26]);
    }
    
}
