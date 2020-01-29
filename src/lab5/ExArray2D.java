package lab5;

import java.util.Scanner;

public class ExArray2D {
    //Array 2 มิติ คือ ตัวแปรที่เก็บข้อมูลในลักษระตาราง แถวแนวนอน (row) และแนวตั้ง (column)
    //โดยใช้เลข index 2 ตัว ในการเข้าถึงข้อมูลใน array เช่น x[0][0]

    public static void main(String[] args) {
        int x[][] = new int[2][3]; //=6 [5][10] =50, last block

        x[0][0] = 10;

        //input data array 2D
        x = inputDataArray(x);

        //display data in array
        ShowDataArray(x);
    }//main

    private static void ShowDataArray(int[][] x) {
        System.out.println("Data in array:");
        int total = 0;


        for (int i = 0; i < x.length; i++) { //วนลูปแถวแนวนอน
            for (int j = 0; j < x[i].length; j++) { //วนลูปแถวแนวตั้ง
                System.out.println("input: ");
                total += x[i][j];
            }//j
            System.out.println();
        }//i
        //show total average
        System.out.println("total value: " + total);
        System.out.println("average value: " + total / 6);
    }

    private static int[][] inputDataArray(int[][] x) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter integer to array below:");
        for (int i = 0; i < x.length; i++) { //วนลูปแถวแนวนอน
            for (int j = 0; j < x[i].length; j++) { //วนลูปแถวแนวตั้ง
                System.out.println("input: ");
                x[i][j] = sc.nextInt();

            }//j
        }//i
        return x;
    }
}//class