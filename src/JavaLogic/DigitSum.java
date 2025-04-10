//Logic Breakdown Trick (EASY TO REMEMBER):
//Think of a number like a stack of digits — you want to take them one by one from the end.
//to get the last digit → use % 10
//(e.g., 123 % 10 = 3)
//
//Add that digit to your total sum.

//Remove the last digit → use / 10
//(e.g., 123 / 10 = 12)
//
//4️ Repeat until number becomes 0

// Memory Trick:
//👉 "% 10 gives last digit,
//👉 / 10 removes last digit.
//👉 Keep adding until number is 0."

//Why used while loop
//We don’t know how many digits are in the number beforehand.
//
//The number could be 1 digit, 2 digits, or 10 digits — so the loop should continue as long as num > 0.
//
//This is a perfect use case for while, because the condition is based on a changing value (num) that we’re shrinking every time.



package JavaLogic;
import java.util.Scanner;


public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();  // Let's say user enters 1234

        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }

        System.out.println("Sum of digits = " + sum);
        sc.close();
    }
}
