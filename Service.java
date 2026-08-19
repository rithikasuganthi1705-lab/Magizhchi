
package jdbc;

import java.sql.SQLException;
import java.util.ArrayList;

public class Service
{
    Dao d=new Dao();
    Model mo = new Model();
    public void insert(Model mo) throws ClassNotFoundException, SQLException
    {
        d.addstd(mo);
        
    }
    public ArrayList  view() throws ClassNotFoundException, SQLException
    {
        return d.viewstd();
               
    }
    public void update(Model mo) throws ClassNotFoundException, SQLException
    {
        d.updatestd(mo);
        
    }

    public void delete(int reg_no) throws ClassNotFoundException, SQLException
    {
        d.delstd(reg_no);
    }
}
