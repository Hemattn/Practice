package Basics;

import java.util.Scanner;

public class MenuClass {
    //method should be static according to question
    public static double areaOfCircle(double radius){
        return 3.14*radius*radius;
    }

    public static double circumferenceOfCircle(double radius){
        return 2*3.14*radius;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Printing the menu.
        System.out.println("*******Menu*******\n" +
                "1. Calculate Area of Circle\n" +
                "2. Calculate Circumference of a Circle\n" +
                "3. Exit.\n" +
                "Choose an option (1-3): \n");
        int choice;
        double radius;
        choice=sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter the desired radius: ");
                radius=sc.nextInt();
                System.out.println("Area of the circle is :"+ areaOfCircle(radius));
                break;
            case 2:
                System.out.println("Enter the desired radius: ");
                radius=sc.nextInt();
                System.out.println("Circumference of the circle is : "+ circumferenceOfCircle(radius));
                break;
            case 3:
                System.out.println("Exit3" +
                        "");
                break;
            default:
                System.out.println("Invalid choice entered");



        }

    }
}
