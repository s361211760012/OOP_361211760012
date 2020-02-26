package lab8_2;

public class PresonApp {
    public static void main(String[] args) {

        //create objects
        Person P1 = new Person("sukanya Srirak","1997");
        Person P2 = new Sheriff("Ponly Sukanya","1996","Thungsong");
        Person P3 = new Police("Downy","1997","Nakhorn");

        P1.introduce();
        P2.introduce();
        P3.introduce();

    }
}
