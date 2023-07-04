//Question 1
//................

package coreJava;


class Car {
    String name;
    String color;
    int year;
    int maxSpeed;

    void accelerate() {
        System.out.println("Car is accelerating");
    }

}
public class CarStudy {
    public static void main(String[] args) {
        Car polo = new Car();
        //shows null for strings 0 for integers
        System.out.println(polo.name);
        System.out.println(polo.color);
        System.out.println(polo.year);
        System.out.println(polo.maxSpeed);
        polo.name = "Polo";
        polo.color = "Red";
        polo.year = 2016;
        polo.maxSpeed = 120;
        System.out.println(polo.name);
        System.out.println(polo.color);
        System.out.println(polo.year);
        System.out.println(polo.maxSpeed);
    }
}

//............................................................................................................................

//Question 2


package coreJava;

import java.util.Scanner;

class Student{
    String name;
    int marks;
    boolean checkPass(){
        return marks > 40;

    }
}
public class ControlFlow
{
    int findMax(int a, int b, int c){
        if (a > b) {
            return Math.max(a, c);
        }
        else {
            return Math.max(b, c);
        }
    }
    public static void main(String[] args) {
         Student s1 = new Student();
         s1.name = "satwik";
         s1.marks = 98;
        Student s2 = new Student();
        s2.name = "lokesh";
        s2.marks = 34;
        System.out.println(s1.checkPass());
        System.out.println(s2.checkPass());

        ControlFlow cf = new ControlFlow();
        System.out.println(cf.findMax(10,7,15));

        char d= 'g';

        switch (d)
        { case 'a':
                System.out.println("Hi,I'=A");
                break;
          case 'b':
                System.out.println("Hi,I'=B");
                break;
          case 'c':
                System.out.println("Hi,I'=C");
                break;
          default:
                System.out.println("I'm not A,B,or C");
                break;
        }




    }

}




