public class Subarray {
    public static void printMaxSubArray(int numbers[]){
        int ts =0;
        int currSum; 
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum=0;
                for(int k=start; k<=end; k++){
                  //  System.out.print(numbers[k]);  // printing subarray
                    currSum += numbers[k];
                }
                ts++;
               
                System.out.println(currSum);
                if(currSum>maxSum){
                    maxSum = currSum;
                }
            }
            System.out.println();

        }
        System.out.println("max sum subarray is:"+maxSum);
        //System.out.println("total subarray is:"+ts);
    }
   public static void main(String[] args) {
    int numbers[] = {1,-2,6,-1,3}; 
    printMaxSubArray(numbers); 
    
    }
}
