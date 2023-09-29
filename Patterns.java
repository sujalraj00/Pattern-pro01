public class Patterns{
    public static void hollow_rectangle(int totrow, int totcol){
        for(int i= 1; i<=totrow; i++ ){
            for(int j=1; j<= totcol; j++){
                if(i==1|| j==1|| i==totrow|| j== totcol){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void inverted_rotated_half_pyramid(int n){
        for(int i=1; i<=n; i++){
            //spaces
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int k=1; k<=i; k++) {
             System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void inverted_half_pyramid_with_numbers(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void floyds_triangle(int n){
        int counter=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
    public static void zero_one_triangle(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
        if((i+j)%2==0){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
            }
    System.out.println();
}   
    }
    public static void butterfly_pattern(int n){
        for(int i =1; i<=n; i++){
        for(int j =1; j<=i; j++){
            System.out.print("*");
        }
        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
        }
        for(int i =n; i>=1; i--){
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
            }
    }
    public static void solid_rhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // public static void hollow_rhombus(int n){
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=(n-i); j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1; j<=n; j++){
    //         if(i==1|| i==n|| j==1|| j==n){
    //             System.out.print("*");
    //         }else {
    //             System.out.print(" ");
    //         }}
    //         System.out.println();
    //     }
    // }
    public static void diamond(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
       System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
       System.out.println();
        }
    }
    public static void main(String args[]){
  hollow_rectangle(6, 10);
inverted_half_pyramid_with_numbers(8);  
  inverted_rotated_half_pyramid(5); 
   floyds_triangle(5);   
butterfly_pattern(12);
 zero_one_triangle(5);
solid_rhombus(4);
hollow_rhombus(5);
diamond(10);
}
}