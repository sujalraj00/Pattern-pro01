import java.util.Arrays;
public class H.W{
    public static void bubblesort(int arr[]){
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
    public static void printarr(int arr[]){
        for(int i=0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
       // System.out.println();

    }
    public static void selectionsort(int arr[]){
        for(int i= 0; i<arr.length-1; i++){
            int min =i;
            for(int j=i+1; j<arr.length; j++){   
                if( arr[min]>arr[j]){
                    min =j;
                }

            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void insertionsorting(int arr[]){
    for(int i=1; i<arr.length; i++){
        int curr = arr[i];
        int prev = i-1;
         //finding the correct pis to  insert
         while (prev>=0 && arr[prev]<curr ){
            arr[prev+1] = arr[prev];
            prev--;
         }
    arr[prev+1]= curr;
    }}
    public static void main(String[] args) {
        int arr[] = {3,5,6,2,1};
      //  bubblesor6(arr);
    //  Arrays.sort(arr); 
    //selectionsort(arr);  
   Arrays.sort(arr);
    // insertionsorting(arr);
    printarr(arr);
     //   Arrays.sort(arr);
    }
}