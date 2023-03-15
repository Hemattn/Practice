package Basics;

import java.util.Scanner;

public class PrintOutput {
    public static void main(String[] args) {
        //java.util.Scanner class me present hota hai.
        Scanner sc= new Scanner(System.in);
        /* We are creating an object sc of the class Scanner by using the keyword new
         and taking System.in as a constructor to tell the compiler to take the input
         from the standard input stream which is basically keyboard, then implementing
         the methods such as nextInt(),nextLine() to get the data from console or terminal.*/
        System.out.println("******Enter data*************");
        String input ="";;


        System.out.println(input);
        while(true){
            String input1=sc.nextLine();
            //equalIgnore case method will ignore the case
            if(input1.equalsIgnoreCase("XDONE")){
                break;
            }
            else
                input+= input1+"\n";
        }
        System.out.println("********************************");
        System.out.println("The data entered is");
        System.out.println(input);
    }
}
