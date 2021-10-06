package basic;

import java.util.Scanner;

public class JavaQuiz4P2 {

    public static void main(String args[])
    {
        int age;
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter your age :");
        age=input.nextInt();
        if(age>=18)
            System.out.println("Congratulations, You are eligible to vote.");
        else
            System.out.println("Sorry, You are not eligible to vote.");
    }
}






