package lab5;

//Chapter 5
public class ExArray {

    //Array คือ ตัวแปรชนอดหนึ่ง ที่สามารถเก็บข้อมูลในตัวแปรหนึ่งตัว โดยใช้เลข index
    //ในการระบุถึงตำแหน่งแต่ละตัวข้อมูล เลข index นี้จะเริ่มต้นที่ 0 เสมอ
    public static void main(String[] args) {

        int x [] = new int[5];

        System.out.println(x[0]); //แสดงข้อมูลใน x ตำแหน่งที่ 0
        x[3] = 100;
        x[1] = x[0] + x[3];
        x[4] = x[1] * 3;

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println(x[4]);

        //error
        //System.out.println(x[5]);
        //System.out.println(x[-1]); //indexOutOfBoundsException: 5

    }//main

}//Class
