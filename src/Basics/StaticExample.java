package Basics;

//Static keyword implementation
public class StaticExample {
    static int a; //Initialising a static member
    static int b = 2;

    //Initialising a static block
    static {
        /*static block is basically used to initialise or change the value of a static variable which in not possible
        in the class definition */

        System.out.println("Static block executed");
        a = 1;
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        System.out.println("********************************");
        System.out.println("Value changed of the static variable");
        b = 4;
        System.out.println("b = " + b);

        System.out.println("********************************");
    }
    //A static method
    public static void introductionOfAPerson(){
        System.out.println("Hi, This is Divya!!");
        a =20;
        System.out.println("a ="+a);
    }

    public static void descriptionOfAPerson(){
        System.out.println("I work at To The New as a trainee.");
    }
  public static void main(String[] args) {
      System.out.println("********************************");
      System.out.println("Main Method executed");
      System.out.println("a = "+ StaticExample.a);
        System.out.println("b = "+b);

      System.out.println("********************************");
      System.out.println("Static method called");
        StaticExample.introductionOfAPerson();
        StaticExample.descriptionOfAPerson();
    }

}
