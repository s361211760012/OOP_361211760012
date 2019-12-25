package lab3;

import java.util.Scanner;

public class control2 {
    public static void main(String[] args) {

        //if-else -> เป็นคำสั่งที่เลือกทำอย่างใดอย่างหนึ่ง
        //โครงสร้างคำสั่ง if-else
        // if (เงื่อนไข){
        //      คำสั่งของ if เมื่อเงื่อนไขเป็นจริง;
        // }else}
        //      คำสั่งขิง if เมื่อเงื่อนไขเป็นเท็จ;
        // }

        Scanner sc = new Scanner(System.in);
        System.out.print("How old are you? : ");
        int age = sc.nextInt();

        if (age > 60) {
            System.out.println("You are old (คุณแก่แล้ว).");
        }else {
            System.out.println("You are old (คุณยังไม่แก่)");
        }


    }//main
}//Class
