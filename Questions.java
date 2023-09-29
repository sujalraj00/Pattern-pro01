import javax.swing.text.html.StyleSheet;

public class Questions{
    public static void removeDuplicates(String str, StringBuilder newStr, int idx, boolean map[] ){
        if(idx == str.length()){
        System.out.println(newStr);
            return;
        } 
        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            removeDuplicates(str, newStr, idx+1, map);
        } else {
            map[currChar-'a'] = true;
            removeDuplicates(str, newStr.append(currChar), idx+1 , map);
        }
    }
      public static int frinendsPairing(int n){
        if(n==1|| n==2){
            return n;
        }
        //choice
        //single
        int fnm1 = frinendsPairing(n-1);
        //pair
        int fnm2 = frinendsPairing(n-2);
        int pairways = (n-1)*fnm2;
        //totways 
        int totways = fnm1+ pairways;
        return totways;
      }
      public static void printBinString(int n ,int lastplace, String str ){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        //
         printBinString(n-1, 0, str+"0");
        if(lastplace ==0){
            printBinString(n-1, 1, str+"1");
        }
    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void mergeSort(int arr[], int si, int ei){
        if(si>=ei){
     return;
        }
        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }
    //merge method to merge sorted part
    public static void merge(int arr[], int si, int mid, int ei){
        int temp [] = new int [ei-si+1];
        int i=si; 
        int j= mid+1;
        int k=0;
        while(i<= mid && j<= ei){
        if(arr[i]<arr[j]){
            temp[k] = arr[i];
         i++;
        }else{
         temp[k] = arr[j];
         j++;
        }
        k++;
        }
        //left over in the 1st part
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        //lefrt over in the 2nd part
        while(j<=ei){
            temp[k++]= arr[j++];
        }
        //copying of temp itn original
        for(k=0, i=si; k<temp.length; k++,i++ ){
            arr[i]=temp[k] ; 
        }

    }
    public static void quickSort(int arr[], int si, int ei){
    if(si>=ei){
        return;
    }
    int pIdx = partition(arr, si, ei);
    quickSort(arr, si, pIdx-1);
    quickSort(arr, pIdx+1, ei);
    }
    public static int partition (int arr[], int si , int ei){
        int pivot = arr[ei];
    int i = si-1;
    for(int j = si; j<ei; j++){
        if(arr[j]<=pivot){
            i++;
            int temp = arr[j];
            arr[ j] = arr[i];
            arr[i] = temp;
        }

    }
    i++;
    int temp = pivot;
    arr[ei] =    arr[i];
    arr[i] = temp;
    return i;
}
public static int search(int arr[],int tar, int si, int ei){
    //base case
    if(si>ei){
        return -1;
    }
//work
int mid = si +(ei-si)/2;
//case found
if(arr[mid] == tar){
    return mid;
}
//case 1; mid on l1
if(arr[si]<=arr[mid]){
    ///case left
    if(arr[si]<=tar && arr[mid]>=tar){
        return search(arr, tar, si, mid-1);
    }else{
   //case right
        return search(arr, tar, mid+1, ei);
    }
//case 2 mid in l2
}else{
    //caze c right
    if(arr[mid]<= tar && arr[ei]>= tar){
        return search(arr, tar,mid +1, ei);
    }else{
    //case left
    return search(arr, tar, si, mid-1);
}}

}
    public static void main(String[] args) {
    //String str = "appnacollege";
    //removeDuplicates(str, new StringBuilder(""), 0, new boolean[26]);
//System.out.println(frinendsPairing(3));    
//printBinString(3, 0, "");
//int arr[] = {4,5,6,7,0,1,2};
//mergeSort(arr, 0, arr.length-1);
//quickSort(arr, 0   , arr.length-1);
//int target = 0;
//int tarIdx =search(arr, target, 0, arr.length-1);
//System.out.println(tarIdx);
//printarr(arr);
}
}