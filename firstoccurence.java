/*write a function ti find the first occurence of an element an array */
public class firstoccurence {
    public static int occurence(int arr[],int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;

        }
        return occurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={8,3,6,4,5,10,2,3,5,3};
        System.out.println(occurence(arr, 5, 0));
    }
    
}
