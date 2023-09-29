import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ClassroomArraylist {
 public static void swap(ArrayList<Integer>list, int idx1, int idx2){
    int temp = list.get(idx1);
    list.set(idx1, list.get(idx2));
    list.set(idx2, temp);
 }
 //bruteforce
 public static boolean pairSum1(ArrayList<Integer>list, int  target){
   for(int i=0; i<list.size(); i++){
       for(int j=i+1; j<list.size(); j++){
           if(list.get(i)+list.get(j)==target){
           return true;
           }
       }
   }
   return true; 
   }
    public static void main(String[] args) {
        //className objectName = new className
      //   ArrayList<Integer>list = new ArrayList<>();
      //   ArrayList<String>list2 = new ArrayList<>();
      //   ArrayList<Boolean>list3 = new ArrayList<>();
      //   list.add(2);
      //   list.add(5);      //O(1)
      //   list.add(9);
      //   list.add(3);
      //   list.add(6);
       // list.add(1,4);    //O(n)
       // System.out.println(list);
     //  System.out.println(list.size());
       //print the arraylist
    //    for(int i=0; i<list.size(); i++){
    //     System.out.print(list.get(i));
    //    }  
    //    System.out.println();
     //get operaation
// int element =   list.get(2);
// System.out.println(element);
// //delete
// list.remove  (2);
// System.out.println(list);
//set 
// list.set(2,10);
// System.out.println(list);
// //contains
// System.out.println(list.contains(2));
// System.out.println(list.contains(11));
//print reverse
// for(int i=list.size()-1; i>=0; i--){
// System.out.print(list.get(i)+" ");
// }
// System.out.println();
//max in arraylist
// int max = Integer.MIN_VALUE;
// for(int i=0; i<list.size(); i++){
//     // if(max<list.get(i)){
//     //     max  = list.get(i);
//     // }
// max = Math.max(max, list.get(i));
// }

// // System.out.println("max no is " +max);
// //int idx1 = 1; int idx2 = 3;
// System.out.println(list);
// //swap(list, idx1, idx2);
// //System.out.println(list);
// //Collections.sort(list);
// // Collections.sort(list, Collections.reverseOrder(null));  
// // System.out.println(list);
//  ArrayList<ArrayList<Integer>>mainLIst = new ArrayList<>();
//  ArrayList<Integer>list1 = new ArrayList<>();
//  ArrayList<Integer>list2 = new ArrayList<>();
// ArrayList<Integer>list3 = new ArrayList<>();
 // list.add(1); list.add(2);
// mainLIst.add(list);
// list2.add(3); list2.add(4);
// mainLIst.add(list2);
// for(int i=0; i<mainLIst.size(); i++){
//    ArrayList<Integer>currList = mainLIst.get(i);
//    for(int j=0; j<currList.size(); j++){
//    System.out.print(currList.get(j)+" ");
//    }
//    System.out.println();
// }
// System.out.println(mainLIst);
// for(int i=1; i<=5; i++){
//    list1.add(i*1);
//    list2.add(i*2);
//    list3.add(i*3);
// }
// mainLIst.add(list1);
// mainLIst.add(list2);
// mainLIst.add(list3);
// System.out.println(mainLIst);
// //nested loop
// for(int i=0; i<mainLIst.size(); i++){
//    ArrayList<Integer>currList = mainLIst.get(i);
//    for(int j=0; j<currList.size(); j++){
//       System.out.print(currList.get(j));
//    }
//    System.out.println();

// }
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

