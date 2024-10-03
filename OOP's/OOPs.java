// <-------Class Pen to learn Object , class and constructor ------------------->
class Pen{
    // Class is blueprint of object. class define properties of object like name, identity and id etc.
    // Eg Pen is a class that define properties (blueprint of object) name 0f pen, color of pen.

    String name;  // Data member
    String color;  // Data member

    public void write(){
        System.out.println("Write something ");
    }

    public void printInfo(){
        System.out.println(this.color);  // this keyword refer to current object
        System.out.println(this.name);
    }

    // Non parametric constructor
    // Called for every object
    // If u comment this Non parametric constructor and code has also parametric constructor then it 
    // demand parameter at time of creating object. To call both parameerric and non parametric together must use below
    Pen(){
        //System.out.println(" Default Constructor has called");
    }

    // Parametric constructor
    Pen(String name, String col){
        this.name = name;
        this.color = col;
    }

    // Copy constructor
    Pen(Pen pen1){
        this.name = pen1.name;
        this.color = pen1.color;
    }

}
//<-------------------------- Pplymorphism START  ---------------------------------------->
class Student{
    String name ;
    int age;

    // polymorphism
    /*
      3 way  (Atleast one should be different but same function name)
      1. Differnt nos.of argument, 
      2. Differnt data type
      3. Different return type void
     */
    public void studentInfo(String name){
        System.out.println("Student's name " + name);
    }
    public void studentInfo(int age){
        System.out.println("Student's Age "+ age);
    }
    public void studentInfo(String name, int age){
        System.out.println("Stdent's name "+ name + " ," + " Student's age "+ age);
    }
}
// <------------------------ Pplymorphism END   ----------------------------------------->
// <------------------------ Inheritence START   ---------------------------------------->
// Increase reusability
/*
  4 Types of Polymorphism upported by java
  1. Single level polymorphism
  2. Multilevel
  3. Heirarchical
  4. Hybride 
  5. Multiple (Not supported by java. for that use interface)
 */
class Shape{                   // 1
    public void area(){
        System.out.println("Display Area: ");
    }
}
class Triangle extends Shape{ // 2         --> 1 to 2 is single level inheritance
    public void area(int l, int h){
        System.out.println( 0.5 * l * h);
    }
}
class EquilaterTriangle extends Triangle{ // 3    --> 1 to 3 is Multi-level inheritence
    public void area(int l , int h){
        System.out.println(1/2 * l * h);
    }
}
class Circle extends Shape{       // 4            --> 1 , 2, and 4 represent Heirarchichal inheritence
    public void area(int r){
        System.out.println(3.14 * r * r);
    }
}

// <------------------------------ Inheritence - END  ------------------------------------------->

// <------------------------------ Abstraction - START  ----------------------------------------->
/*
 Abstraction means hidindg internal details or meaningless detail for user and showing importent detail.
 Abstract class define blueprint of sub-class;
  It can achieve by two way
  1. Using abstract keyword
  2. Using interface
 */
// Using abstract keyword
abstract class  Annimal {
    abstract void walk();
    /*{
        // No content , no curly braces for abstract method. its blueprint that ensure every subclass should have walk method
    }*/

    // abstract class can have both abstract or non abstract method.
    // But non abstract method may not be preent in the subclass. and must present abstract method in all subclass.
    // It can hve constructor and static, final method.

    Annimal(){
        System.out.println("Animal constructed");
    }

    public void eat(){ // Non abstratc class
        System.out.println("Animal eat");
    }
}
class Chiken extends Annimal{
    Chiken(){
        System.out.println("Chiken constructed");
    }
    public void walk(){
        System.out.println("Chiken Walk on two legs");
    }
}
class Cow extends Annimal{
    public void walk(){
        System.out.println("Cow Walk on 4 legs");
    }
}

// Using interface (pure abstration)
// All the field inside  interface are public, static and final by default
// methods are public by default.
interface MyAnimal{
    int Eye = 2; // by default final. it can't be change.
    void walk();
    // U can't use MyAnimal as constuctor bcz MyConstructor is not class. It is interface.
    /*
     MyAnimal(){
     }
     */
}
interface Herbivore{
    int Ear = 2;
    
    /*
    public void speak(){ abstarct method do not require body
        System.out.println("Mein mein");  
    }*/

    public void speak();
}
class Horse implements MyAnimal{
    public void walk(){
        System.out.println("Horse walk on 4 legs");
    }
}
class Goat implements MyAnimal, Herbivore{
    public void walk(){
        System.out.println("Goat walk on 4 legs");
    }
    public void speak(){
        System.out.println("Goat speaks Meen meen");
    }
}
//<--------------------- static keyword ------------------------------->
class Player{
    // To access static data member or member function. No need to create object. save memory
    // Using class name , u can do it. Eg player.team="Ambassdor" but for non static u need create object of that class.
    static String team; // team name same for all player
    String player_name;  // name of player inside that team
  }


// <<<<<<------------------------  Main method ----------------------------->>>>>
public class OOPs {
    public static void main(String[] args) {

        // <----------------------- Object - Class - Constructor ------------------------------------->
        // Now here is object of class Pen whose color, name etc define in class Pen;
        // Pen1 and Pen2 are objects.
        Pen pen1 = new Pen();  // Pen is class, pen1 is object and Pen() is default constructor
        Pen pen2 = new Pen();  // Non-paramatric or Default constructor
        Pen pen3 = new Pen("Saino softek", "Black"); // Parametric constructor must define inside class.
        pen1.name = "Gel";
        pen1.color = "Blue";
        Pen pen4 = new Pen(pen1); // Copy constructor (User defined) . object pen4 will copy from pen1. 
                                //Make sure first pen1 is initialize other then create copy constructor.

        /*
         
         new keyword is used to allocate memory in heap for object.
         Pen() is a special method called constructor whose name is same as class name, no return type like int , void etc.
         It called only one. In java, constructor is used to construct object.
         --> Three types of constructor
            1. Parametric constructor
            2. Non pamatric constructor
            3. Default constructor
         */

        //pen1.name = "Gel";
        //pen1.color = "Blue";

        pen2.name = "Likho Pheko";
        pen2.color = "Red";  // After commenting, it will return null

        //pen1.write();
        //pen1.printInfo();
        //pen2.printInfo();
        //System.out.println("Paramatric constructor called");
        //pen3.printInfo();
        //System.out.println("copy constructor called");
        //pen4.printInfo();

        // <----------------------- Object - Class - Constructor - End ------------------------------------>

        // <------------------------------ Polymorpism - START  ------------------------------------------->
        Student s1 = new Student();

        //s1.studentInfo("Hari");  // wrong way
        //s1.name = "Aman";
        //s1.age = 34;
        //s1.studentInfo(s1.name);
        //s1.studentInfo(s1.age);
        //s1.studentInfo(s1.name, s1.age);

       // <------------------------------ Polymorpism - END  ------------------------------------------->

       // <------------------------------ Inheritence - START  ------------------------------------------->

      // Circle c = new Circle();
       //Triangle t = new Triangle();
       //c.area();  // print display Area
       //c.area(4);

       //t.area(4,6);

       // <------------------------------ Inheritence - END  ------------------------------------------->

       // <------------------------------ Abstraction - START  ------------------------------------------->

       //Cow cow = new Cow();
       //Chiken chiken = new Chiken();
       //cow.walk();
       //chiken.walk();
       //chiken.eat();
       // If there is constructor then First parent class constructor called for every object created by suclass, 
       //then all object of subclass in which constructor created. This process is called Chain of constructor in Java.

      //  Animal animal = new Annimal() ; we can't do it bcz animal is abstract class. Runtime error as not initiated.

      // abstraction using interface
      //Horse horse = new Horse();
      //Goat goat = new Goat();
      //horse.walk();
      //System.out.println(horse.Eye);
      //goat.walk();
      //goat.speak();

      // <------------------------------ Abstraction - END  ------------------------------------------->
      // <------------------------------  Static Meaning    ------------------------------------------->
      Player.team = "India";  // Directly using class bcz team is static

      Player plr1 = new Player();
      plr1.player_name = "Virat"; // plr is object anccess through object not class. since player_name is not static.

      System.out.println(Player.team);
      System.out.println(plr1.player_name);

    }
}
