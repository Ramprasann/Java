public class arrayfun {
    public static void prin(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={2,4,5};
        prin(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
    
}
