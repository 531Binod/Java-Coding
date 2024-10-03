// There are mainly four process in oop's
// 1. Implementation of Encapsulation
// Wrapping of data into single unit is called Encapsulation. Class is an example of Encapsulation where it wrap 
// several data member and member funtion into single unit. 
// In this exaple, Empid, age , basicSalary, incentive, calsalary are wrap into single unit which Employee

// Why Encapsulation?
// To increase security. You can think like what ingredients are mixed in the medicene. It is unknown. 
// I.e our data or information is secure.

// How encapsulation provides security?
// We can use private data member or member function to avoid restriction of access it

// Types of access modifier    class    package     subclass      Global
//    public                    YES      YES          YES          YES
//    protedted                 YES      YES          YES          NO
//    Default                   YES      YES          NO           NO
//    Private                   YES      NO           NO           NO

class  Employee {
    int EmpID=2; // Data member
    static int age = 26; // Data member
    private int basicSalary = 2000; // Data member
    int incentive=200;   // Data member

    void calSalary(){   // Member function
        System.out.println(basicSalary + incentive);
    }
}
public class test {
    public static void main(String[] args) {
        // Creating object of class Employee
        Employee engineer = new Employee();
        System.out.println(engineer.EmpID); // access through object engineer of class Employee as output 2
        System.out.println(engineer.age);   // output as 26
        engineer.calSalary();
        //System.out.println(engineer.calSalary());
        //System.out.println(engineer.basicSalary); // Gives error bcz it is private and in this way it provides security.


        //Access throgh a class but not using object
        System.out.println(Employee.age);   // output as 26, here static data member can be access without object
        //System.out.println(Employee.EmpID); // gives error bcz EmpID is not static so use object

        // This file is out of package. So use import package


    }
}