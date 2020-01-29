package lab4;

public class MethodEx {

    //1. No return No parameter : คือ เมธอคที่ไม่มีการรับค่าพารามิเตอร์
    // และไม่คืนค่าใดกลับหลังจาก process แล้ว
    //2. No return 1 or  more parameter : คือ เมธอคที่มีการรับพารามิเตอร์ตั้งแต่ 1 หรือมากกว่า
    //และไม่มีการรับค่าพารามิเตอร์
    //3. Return 1 value, 1 or more parameter : คือ เมธอคที่มีการรับพารามิเตอร์ตั้งแต่ 1 หรือมากกว่า
    //และมีการคืนค่ากลับไปยังส่วนที่เรียกใช้งาน ๖เรียกใช้งานที่ไหน คืนค่าไปที่นั่น)
    public static void main(String[] args) {

        System.out.println("Hello From Main().");
        //calling method A()
        A();
        A();
        A();
        //calling method B()
        B("MIT","RUTS");
        //calling method C()
        //1. ประกาศตัวแปรชนิดเดียวกันมาเก็บค่าที่เมธอคส่งกลับมา
        int summation = C(10,20);
        System.out.println("The summation of x and y : "+summation);
        //2. เรียกใช้เมธอคโดยไม่ประกาศตัวแปรใดๆ มาเก็บค่าที่ส่งกลับมา
        System.out.println("The summation of x and y (2) : "+C(50,50));
    }//main

    public static void A() {
        System.out.println("Hello From A");
    }//A
    public static void B(String msg, String msg2) {
        System.out.println("Hello from B().");
        System.out.println("Message: "+msg);
        System.out.println("Message2: "+msg2);

    }//B

    public static int C(int x, int y){
        System.out.println("Hello from C().");
        int sum = x + y;
        return sum;
    }

}//Class