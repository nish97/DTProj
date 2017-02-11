package JDBCEx;

import java.sql.*;

public class JDBCEx1 {

    public static void main(String[] args) {
        try{
            //Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/DB100", "niit", "niit");
            Statement s = con.createStatement();
            //boolean b = s.execute("CREATE TABLE product(pid INT PRIMARY KEY,"
            //       + "pname VARCHAR(30),quantity INT,price DOUBLE)");
            //int a=s.executeUpdate("INSERT INTO product values(1"
            //        + ",'P1',10,100)");
            ResultSet rs = s.executeQuery("select * from product");
            /*if(a>0){
                System.out.println("Data Inserted");
            }
            else{
                System.out.println("Data Not Inserted");
            }*/
            while(rs.next()){
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getDouble(4));
            }
            con.close();
        }
        /*catch(ClassNotFoundException cnf){
            System.out.println(cnf);
        }*/
        catch(SQLException se){
            System.out.println(se);
        }
    }
    
}
