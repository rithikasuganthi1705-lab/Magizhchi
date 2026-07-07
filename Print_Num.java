
package thread;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Print_Num extends Thread
{
    @Override
    public void run()
    {
        for (int i = 1; i <= 5; i++) 
        {
            try {
                System.out.println(i); 
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Print_Num.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      
    }
}
