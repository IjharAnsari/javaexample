import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.*;

public class DbConnection{
    public static void main(String... args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ikiread","ij","");
        PreparedStatement ps=con.prepareStatement("select * from tb");
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }

    }
}