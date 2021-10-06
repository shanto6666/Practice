package basic;

import java.util.Scanner;

public class JavaQuiz4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        int x = input.nextInt();
        System.out.print("Input second number: ");
        int y = input.nextInt();
        System.out.print("Input third number: ");
        int z = input.nextInt();
        if (x < y && y < z)
        {
            System.out.println("Increasing order");
        }
        else if (x > y && y > z)
        {
            System.out.println("Decreasing order");
        }
        else
        {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}







