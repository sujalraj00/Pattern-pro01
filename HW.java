import java.util.Scanner;

public class HW{
//     public static int  swap(int a, int b){
//      Scanner sc= new Scanner(System.in);
//    //  int a = sc.nextInt();
//      //int b = sc.nextInt();
//      a = a+b;
//      b=a-a;
//      a=a-b;
//     System.out.println(a,b);
//     return 0;
//     }
public static int fib(int n){
  if(n==0||n==1){
    return n;
  }
 int fibnm1= fib(n-1);
 int  fibnm2 = fib(n-2);
 int fn = fibnm1+fibnm2;
  return fn;
}
    public static void main(String args[]){
    System.out.println(fib(100));
    }
}