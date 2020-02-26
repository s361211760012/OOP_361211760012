package lab9;

import java.sql.*;
import java.util.ArrayList;

public class TestJDBC {


    public static void main(String[] args) {

        //step 1: load driver

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println("Load driver successfully.");

        //step 2: Create Connection
        ArrayList<Employee> myList = new ArrayList<Employee>();
            String SQCONN = "jdbc:sqlite:company.sqlite";
        Employee myEMP;
        try {
            Connection conn = DriverManager.getConnection(SQCONN);
            if (conn == null) {
                System.out.println("could not connecy to database.");
            }else {
                System.out.println("connected to database.");
            }
            //step 3: Create Statement
            Statement stmt = conn.createStatement();
            String sql = "select * from Employee";
            ResultSet rs = stmt.executeQuery(sql);

            //step 4: display
//            System.out.println("Employee Infromtion");

            while (rs.next()){
//                System.out.println("######################");
//                System.out.println("empID: "+rs.getInt(1));
//                System.out.println("Name: "+rs.getString(2));
//                System.out.println("Position: "+rs.getString(3));
//                System.out.println("Salary: "+rs.getDouble(4));
                Employee emp = new Employee(rs.getInt(1),(rs.getString(2)),(rs.getString(3)),(rs.getDouble(4));
                myEMP.add(emp);
            }
            //Step 5:
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //
        System.out.println();
        for (Employee e:myEMP)
            System.out.println(e.toString());

    }
}
