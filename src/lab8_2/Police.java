package lab8_2;

public class Police extends Person {
    private String workCountry;

    public Police(String name, String dateOfBirth, String workCountry) {
        super(name, dateOfBirth);
        this.workCountry = workCountry;
    }
    public void introduce(){
        super.introduce();
        System.out.println("I work at "+this.workCountry);
    }
    //getter and setter

    public String getWorkCountry() {
        return workCountry;
    }

    public void setWorkCountry(String workCountry) {
        this.workCountry = workCountry;
    }

    //toString

    @Override
    public String toString() {
        return "Police{" +
                "workCountry='" + workCountry + '\'' +
                "} " + super.toString();
    }
}