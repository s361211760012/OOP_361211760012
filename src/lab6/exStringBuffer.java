package Lab6;

import java.util.StringTokenizer;

public class exStringBuffer {
    public static void main(String[] args) {


        // StringBuffer เป็นคลาส ที่มีเมธอคต่างๆ
        // ที่สามารถปรับปรุงแก้ไขข้อมูลที่เป็น String ได้มากกว่าคลาส String ทั่วไป

        StringBuffer StrBuf = new StringBuffer("Hello");
        System.out.println(StrBuf);
        //append() ใช้สำหรับต่อ String
        StrBuf.append("Saiyai");
        System.out.println(StrBuf);
        System.out.println(StrBuf.reverse());
        StrBuf.delete(0,6);
        System.out.println(StrBuf);


        //StringTokenizer
        String s = "Still youthful at 41, Bryant -- who died in a helicopter crash Sunday in " +
                "California -- looked like he could suit up and drop 30 points on a rival NBA team." +
                " It doesn't seem that long ago that he was scoring 60 points in his final NBA game, " +
                "soaking up the cheers of Los Angeles Lakers fans who worshiped him for two decades as " +
                "one of the city's favorite sons.";

        StringTokenizer tokenizer = new StringTokenizer(s);
        int contWord = tokenizer.countTokens();
        System.out.println("Word count from message: "+contWord);

        // word cutting
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }








    }//main

}//class