
package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class Dao 
{
    public Connection connection() throws ClassNotFoundException, SQLException
    {
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/collegedb",
                "postgres",
                "rithika"
        );
    }
    public void addstd(Model mo) throws ClassNotFoundException, SQLException
    {
        Connection con = connection();
        String sql = "insert into col(reg_no,name,year,dept) values (?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,mo.getReg_no());
        ps.setString(2,mo.getName());
        ps.setInt(3,mo.getYear());
        ps.setString(4,mo.getDept());
        int row=ps.executeUpdate();
        if(row>0)
        {
            System.out.println("Student added");
        }
        else
        {
            System.out.println("Cannot add");
        }
    }
    public ArrayList viewstd() throws ClassNotFoundException, SQLException
    {
        ArrayList list = new ArrayList();
        Connection con = connection();
        String sql = "select *from col";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next())
        {
            Model mo = new Model();
            mo.setReg_no(rs.getInt(1));
            mo.setName(rs.getString(2));
            mo.setYear(rs.getInt(3));
            mo.setDept(rs.getString(4));
            list.add(mo);
            
        }
        return list;
    }
    
    public void updatestd(Model mo) throws ClassNotFoundException, SQLException
    {
        Connection con = connection();
        String sql = "update col set name=?, year=?, dept=? where reg_no=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,mo.getName());
        ps.setInt(2,mo.getYear());
        ps.setString(3,mo.getDept());
        ps.setInt(4,mo.getReg_no());
        int row =ps.executeUpdate();
        
        if(row>0)
        {
            System.out.println("Student updated");
            
        }
        else
        {
            System.out.println("Student not updated");
        }
       
    }
    public void delstd(int reg_no) throws ClassNotFoundException, SQLException
    {
        Connection con = connection();
        String sql = "delete from col where reg_no= ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,reg_no);
        int row = ps.executeUpdate();
        if(row>0)
        {
            System.out.println("Student deleted successfully");
        }
        else
        {
            System.out.println("Student not deleted ");
        }
    }
  
}
