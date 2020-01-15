package lab5;

import java.util.Scanner;

public class ExArray2 {


    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x[] = new int[5];

        //for
        for (int i = 0; i < x.length; i++) {

            System.out.println("Exter an integer:");
            x[i] = sc.nextInt();

        }

        //display data in array
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println(x[4]);

        //fori
        System.out.println("Data in array:");
        for (int i = 0; i < x.length ; i++) {
            System.out.println(x[i]);

        }
        //foreach
        System.out.println("Data in array(foreach):");
        for (int val:x){ //วนลูปอ่านค่าข้อมุลใน array ที่ละตำแหน่งมาเก็บในตัวแปร val
            System.out.println(val);
        }
        showDataArray(x);
        totalDataArray(x);
    }//main

    private static void totalDataArray(int[] x) {
        int total = 0;
        for (int val : x) {
            total += val;
        }
        System.out.println("The total value in array: "+total);
        System.out.println("the average value is: "+(total/x.length));
    }
    private static void showDataArray(int[] x) {
        System.out.println("Data in array:");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
    //สร้างเมธอคสำหรับแสดงผลรวมข้อมูลทั้งหมดใน array

}//Class
