import java.util.ArrayList;
import java.lang.annotation.Target;
import java.util.*;

public class ArrayList{
    // public static int storeWater(ArrayList<Integer> height){
    //     int maxWater =0; 
    //     for(int i=0; i<height.size(); i++){
    //         for(int j=i+1; j<height.size(); j++){
    //             int ht= Math.min(height.get(i), height.get(j));
    //             int width = j-i;
    //             int currWater  = ht * width;
    //             maxWater = Math.max(maxWater, currWater);
    //         }
    //     }
    //     return maxWater;
    // // }
    // public static int storeWater(ArrayList<Integer>height){
    // int maxWater = 0;
    // int lp =0; 
    //  int rp = height.size()-1;
    //  while(lp<rp){
    //     //calculate water area
    //     int ht = Math.min(height.get(lp), height.get(rp));
    //     int width = rp- lp;
    //     int currWater = ht*width;
    //     maxWater = Math.max(maxWater, currWater);
    //     //update ptr
    //     if(height.get(lp)<height.get(rp)){
    //         lp++;
    //     } else{
    //         rp--;
    //     }
    //  }
    //  return maxWater;                                    
    // }
    public static boolean pairSum1(ArrayList<Integer>list, int  target){
    for(int i=0; i<list.size(); i++){
        for(int j=i+1; j<list.size; j++){
            if(list.get(i)+list.get(j)==target){
            return true;
            }
        }
    }
    return true; 
    }
    public static void main(String args[]){
//    ArrayList<Integer> height = new ArrayList<> ();
//        height.add(1);
//     height.add(8);
//     height.add(6);
//     height.add(2);
//            height.add(5);
//            height.add(4);
//            height.add(8);
//            height.add(3);
//            height.add(7);
//     System.out.println(storeWater(height));
//    
ArrayList<Integer> list = new ArrayList<>();
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);
list.add(6);
int target = 5;
System.out.println(pairSum1(list,target));}
}