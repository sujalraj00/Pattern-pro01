public class Main{
    public static void printSpiral(int matrix[][]){
    int startrow =0;
    int endrow  = matrix.length-1;
    int startcol = 0;
    int endcol  = matrix[0].length-1;
    while(startcol<= endcol && startrow<= endrow){
        //top
        for(int j= startcol; j<=endcol; j++){
            System.out.print(matrix[startrow][j] + " ");
        }
        //right
        for(int j = startrow+1; j<=endrow; j++){
            System.out.print(matrix[j][endcol]+" ");
        }
        //bottom 
        for(int j = endcol-1; j>= startcol; j--){
         if (endrow == startrow){
            break;
         }
         System.out.print(matrix[endrow][j]+" ");
        }//left
        for(int j = endrow-1; j>=startrow +1; j--){
        if(startcol==endcol){
            break;
        }
        System.out.print(matrix[j][startcol]+" ");
        }
        startcol++;
        endcol--;
        startrow++;
        endrow--;
    }
    System.out.println();
    }

    public static int diagonalSum(int matrix[][]){
    int sum=0;
        // for(int i=0; i<matrix.length; i++){
        //     for(int j =0; j<matrix[0].length; j++){
        //         if(i==j){
        //         sum += matrix[i][j];
        //         }
        //         else if(i+j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
       for(int i=0; i<matrix.length; i++){
        //pd
        sum += matrix[i][i];
        //sd
        if(i != matrix.length-1-i)
        sum += matrix[i][matrix.length-1-i];
       }
        return sum;
    }
    public static boolean staircase(int matrix[][],int key){
        int row =0; int col = matrix[0].length-1;
        while (row<matrix.length && col >0){
            if(matrix[row][col]==key){
                System.out.println("key found at index : ("+row+","+col+")");
            return true;
            }
            else if(matrix[row][col]<key){
                row++;
            }
            else col--;
        }
        System.out.println("key not found");
        return false;
    }
     public static boolean pallindrome(String str){
        for(int i=0; i<Str.length(); i++){
            int n = str.length();
            if(Str.charAt(i) != Str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
//         int matrix [][] = {{10,20,30,40},
//                             {15,25,35,45},
//                           {27,29,37,48},
//                           {32,33,39,50}};
// //int key = 33;
//  staircase(matrix, 31);

 //System.out.println(diagonalSum(matrix));                          //printSpiral(matrix);
String str = "noon";
System.out.println(pallindrome(str)); 
}
}
