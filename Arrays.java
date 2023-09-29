import java.util.Collections;
public class Arrays{
    public static void bubblesort(Integer arr[]){
        for(int turn =0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printarr(Integer arr[]){
        for(int i=0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
 System.out.println();

    }
   
    public static void main(String[] args) {
      Integer arr[] = {3,5,6,2,1};
   Arrays.sort(arr, Collections.reverseOrder()); 
 
   printarr(arr);
    
    }
}