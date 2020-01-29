package Lab4;

import java.util.Scanner;

public class Method_Exercise {
    //1. เขียนโปรแกรมเพื่อรับค่าจำนวนจริง 2 จำนวน จากการสร้างเมธอคสำหรับ
    //บวก ลบ คูณ หาร แสดงผลงานทางจอภาพ

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        double x = sc.nextDouble();
        System.out.print("Enter number 2 : ");
        double y = sc.nextDouble();


        //display
        System.out.println("The summation of"+x+"and"+y+": "+sum(x,y));
        System.out.println("The summation of"+x+"and"+y+": "+sub(x,y));
        System.out.println("The summation of"+x+"and"+y+": "+mul(x,y));
        System.out.println("The summation of"+x+"and"+y+": "+div(x,y));
    }
    //sum
    public static double sum(double x, double y) {
        return x + y;
    }
    //sub
    public static double sub(double x, double y) {
        return x - y;
    }
    //mul
    public static double mul(double x, double y) {
        return x * y;
    }
    //div
    public static double div(double x, double y) {
        return x / y;
    }

}//Class