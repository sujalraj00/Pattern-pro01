import javax.swing.text.html.StyleSheet;

public class BitManipulation{
    public static void oddoreven(int n){
    int bitmask =1;
    if((n&bitmask)==0){
        System.out.println("even number");
    } else{
        System.out.println("odd number");
    }
    }
    public static int getIthbit(int n, int i){
        int bitmask = 1<<i;
        if((n&bitmask)==0){
            return 0; 
        } else {
            return 1;
        }
    }
    public static int setbit(int n, int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }
    public static int clearbit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    //public static int updateithbit(int n , int i, int newbit){
        

    public static int fastexpo(int x,int x){
    int ans =1;
        while(x>0){
        if((x&1)!=0){
            ans = ans*x;
        }
        x=x*x;
        x=x>>1;
    }
    return ans;
    }
    public static void main(String[] args) {
  //0 System.out.println(getIthbit(4, 1));
  // System.out.println(setbit(17, 2));
System.out.println(fastexpo(5));    
}}
