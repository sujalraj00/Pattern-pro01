public class OOPS{
    public static void main(String args[]){
    //Student s1 = new Student("sujal");
   // System.out.println(s1.name);
// Student s1 = new Student();
// Student s2 = new Student("sujal");
// Student s3 = new Student(123);
// Horse h = new Horse();
// h.eat();;
// h.walk();
// chicken c   = new chicken();
// c.eat();
// c.walk();
// System.out.println(h.color);
//Animal a = new Animal();
//Mustang myhorse = new Mustang();//Animal ->horse -> mustang
Queen q = new Queen();
q.moves();
Bear   b = new Bear();
b.eats();
b.walks();
}
}
class Student{
    String name;
    int roll;
    //paramiterised constructor
    Student(String name) {
     this.name = name;
    }
    //non paramiterised constructor
    Student(){
        System.out.println("constructor is called...");
    }
    Student (int roll){
        this.roll = roll;
    }
}
abstract class Animal{
  String color;
    Animal (){
    System.out.println("animal constructor call");
 }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{
Horse(){
    System.out.println("horse constructor called");
}
    void changecolor(){
    color = "dark brown";
}
    void walk (){
    System.out.print("walks on four legs");
}
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("mustang constructor called");
    }
}
class chicken extends Animal{
    void changecolor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
interface Chessplayer{
    void moves();
}
class Queen implements Chessplayer{
    public void moves(){
        System.out.println("up, down , left, right, diagonal(in 4 dir)");
    }
}
class Rook implements Chessplayer{
    public void moves(){
        System.out.println("up, down , left, right");
    }
}
class King implements Chessplayer{
    public void moves(){
        System.out.println("up, down , left, right, diagonal(by 1 step)");
    }
}
interface  Hervivore{
    void eats();
}
interface carnivore{
    void walks();
}
class Bear implements Hervivore,carnivore{
    public void eats(){
        System.out.println("bear eats ");
    }
    public void walks(){
        System.out.println("bear walks");
    }
}
