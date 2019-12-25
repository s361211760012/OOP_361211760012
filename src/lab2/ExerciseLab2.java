package lab2;

import java.util.Scanner;

public class ExerciseLab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your weight: ");
        double w = sc.nextDouble();
        System.out.print("Enter Your height (Meter): ");
        double h = sc.nextDouble();

        double bmi = w / (h * h);
        System.out.print("Your BMT is: " + bmi);

    }//main
}//class

