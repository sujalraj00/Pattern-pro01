public class Backtracking {
    // public static void changearr(int arr[], int i, int val){
    //     if(i==arr.length){
    //         printArr(arr);
    //         return;
    //     }
    //     arr[i] = val;
    //     changearr(arr, i+1, val+1);
    //     arr[i]= arr[i]-2;
    // }
    // public static void printArr(int arr[]){
    //     for(int j=0; j<arr.length; j++){
    //         System.out.print(arr[j]+" ");
    //     }
    //     System.out.println();
    // }
    public static void findSubsets(String str, int i, String ans){
        if(i==str.length()){
        
                System.out.println(ans);
             return;
            }
    
        //yes
    findSubsets(str, i+1, ans+str.charAt(i));
        //no
    findSubsets(str, i+1, ans);
    }
    public static void findPermutation(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            //"abcd" remove c = "ab" +"d"
            String newStr = str.substring(0, i)+str.substring(i+1); 
            findPermutation(newStr, ans+curr);
        }
    }
    public static boolean isSafe(char board[][], int row , int col){
        //verertical uop
        for(int i =row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diag up left
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j-- ){
            if(board[i][j] =='Q'){
                return false;
            }
        }
        //diag up right
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j] =='Q'){
                return false;
            }
        }
        return true;
    }
    public static boolean nQueens(char board [][], int row  ){
        //base
        if(row == board.length){
         count++ ;
            //   printBoard(board);
            return true;
        }
        //column loop
        
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
            board[row][j] ='Q';
            if(nQueens(board, row+1)){
                return true;
            } //fum calling
            board[row][j] = 'x';//backtracking
        }}
        return false;
    }
    public static void printBoard(char board[][]){
        System.out.println("-------chess board----------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }
    }
    static int count=0;

    public static int gridWays(int i, int j, int n, int m){
        if(i==n-1&& j==m-1){
            return 1;
        }else if(i==n|| j==m){
            return 0;
        }
       int w1= gridWays(i+1, j, n, m);
       int w2= gridWays(i, j+1, n, m);
       return w1+w2;
    }
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);

    }
    public static int gridwaylinearTC(int n, int m){
       int   i = factorial(n+m-2);
     int j = factorial(n-1);
      int k= factorial(m-1);
      int f = j*k;
      return i/f;
    }
    public static boolean isSafe(int sudoku[][], int row, int col, int digit){
        //column
        for(int i=0; i<=8; i++){
            if(sudoku[i][col] == digit){
                return false;
            }
        }
        //row
        for(int j =0; j<=8; j++){
            if(sudoku[row][j] == digit){
                return false;
            }
        }
        //grid
        int Sr = (row/3)*3;
        int Sc = (col/3)*3;
        for(int i =Sr; i<Sr+3; i++){
            for(int j=Sc; j<Sc+3; j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokuSolver(int sudoku[][],int row, int col){
    //base case
    if(row ==9 ){
        return true;
    }
    //recursion
    int nextRow = row , nextCol  = col+1;
    if(col+1==9){
    nextRow = row+1;
    nextCol =0;
    }
    if(sudoku[row][col] != 0){
        return sudokuSolver(sudoku, nextRow, nextCol);
    }
    for(int digit =1; digit<=9; digit++){
        if(isSafe(sudoku, row, col, digit)){
            sudoku[row][col] = digit;
            if(sudokuSolver(sudoku, nextRow, nextCol)){
                return true;
            }
        }
        sudoku[row][col] = 0;
    }
    return false;
    }
    public static void printSudoku(int sudoku [][]){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print (sudoku[i][j] +" ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
    // int arr[] = new int[5];
    // changearr(arr, 0, 1);
    // printArr(arr);        
  //  String str = "abc";
    //findSubsets(str, 0, "");
//findPermutation(str, ""); 
// int n=4;
// char board [] [] = new char[n][n];
// //iniitialise
// for(int i=0; i<board.length; i++){
//     for(int j=0; j<board.length; j++){
//         board[i][j] = 'x';
//     }
// }
// if(nQueens(board, 0)){
//     System.out.println("solution uis possible");
//     printBoard(board);
// }else{
//     System.out.println("soklution is not possible");
// }
//System.out.println("total ways to solve n queens = " + count);
//int n=3,m=3;
//System.out.println(gridwaylinearTC(n, m));
int sudoku[][] = {{0,0,8,0,0,0,0,0,0},
{4,9,0,1,5,7,0,0,2},
{0,0,3,0,0,4,1,9,0},
{1,8,5,0,6,0,0,6,0},
{0,0,0,0,2,0,0,6,0},
{9,6,0,4,0,5,3,0,0},
{0,3,0,0,7,2,0,0,4},
{0,4,9,0,3,0,0,5,7},
{8,2,7,0,0,9,0,1,3}
};
if(sudokuSolver(sudoku, 0, 0)){
    System.out.println("sol exist ");
    printSudoku(sudoku);
} else{
    System.out.println("sol does not exist");
}
}
}
