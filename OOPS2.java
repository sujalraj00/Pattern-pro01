import Animals.Dog;

public class OOPS2 {
public static void main(String args[]){
// Fish shark = new Fish();
// shark.eat();
// Dog dobby = new Dog();
// dobby.eat();
// dobby.legs=4;
// System.out.println(dobby.legs);
Calculator calc = new Calculator();
System.out.println(calc.sum(1, 2));
System.out.println(calc.sum((float)1.5, (float)2.5));
System.out.println(calc.sum(1, 2, 3 ));
Deer d = new Deer();
d.eat();
}    
}
//base class
class Animals{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breaths");
    }
}
  class Mammal extends Animals{
   // int legs;
void walk(){
    System.out.println( "walks");
}
}
  
class Dog extends Mammal{
    String breed;
}
//derivedd class / sub class
class Fish extends Animals{
   // int fins;
    void swim(){
        System.out.println("swims in water");
    }
}
class Bird extends Animals{
    void fly(){
        System.out.println("fly");
    }
}
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a,int b, int c){
        return a+b+c;
    }
}
class Animal{
    void eat(){
        System.out.println("eats anything ");
    }
}
class Deer extends Animal {
    void eat (){
        System.out.println("eats grass");
    }
}