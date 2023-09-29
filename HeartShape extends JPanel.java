//import java.lang.FdLibm.Pow;

public class HeartShape{
 public static int optimisedpower(int a, int n){
 if(n==0){
    return 1;
 }
    int halfpow = optimisedpower(a,n/2) * optimisedpower(a,n/2);
 //odd case
 if(n%2!=0){
     halfpow = a*halfpow;
 }
 return halfpow;
 } 
public static void main(String[] args) {
System.out.println(optimisedpower(2,10));  
}
}