
package jdbc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller 
{
    public static void start() throws ClassNotFoundException, SQLException
    {
        Scanner n =new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        Model mo = new Model();
        Service se = new Service();
        while(true)
        {
            System.out.println("1.ADD STD,"
                    + " 2.VIEW STD,"
                    + " 3.UPDATE STD,"
                    + " 4.DELETE STD,"
                    + " 5.EXIT");
            System.out.println("Enter your choice: ");
            int choice = n.nextInt();
            
            switch(choice)
            {
                case 1:
                {
                    System.out.print("Enter student reg_no: ");
                    mo.setReg_no(n.nextInt());
                    System.out.print("Enter student name: ");
                    mo.setName(s.nextLine());
                    System.out.print("Enter student year: ");
                    mo.setYear(n.nextInt());
                    System.out.print("Enter student Department: ");
                    mo.setDept(s.nextLine());
                    se.insert(mo);
                    break;
                }
                case 2:
                {
                    ArrayList <Model> list = se.view();
                    for(Model m : list)
                    {
                        System.out.println(m.getReg_no()+"|"+m.getName()+"|"+m.getYear()+"|"+m.getDept());
                        System.out.println(" ");
                        
                    }
                    break;
                    
                }
                case 3:
                {
                    System.out.println("Enter student reg_no: ");
                    mo.setReg_no(n.nextInt());
                    System.out.println("Enter student name: ");
                    mo.setName(s.nextLine());
                    System.out.println("Enter student year: ");
                    mo.setYear(n.nextInt());
                    System.out.println("Enter student Department: ");
                    mo.setDept(s.nextLine());
                   se.update(mo);
                   break;   
                }
                case 4:
                {
                    System.out.println("Enter student reg_no: ");
                   int reg_no=n.nextInt();
                   se.delete(reg_no);
                   break;
                }
                case 5:
                {
                    System.exit(0);
                    System.out.println("DONE");
                    break;
                }
                default:
                    System.out.println("Choice not available");
            }
        }
    }
    
}
