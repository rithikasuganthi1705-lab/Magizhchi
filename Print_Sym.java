/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Print_Sym extends Thread
{
    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++) 
        {
            try {
                System.out.println("@#$");
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Print_Sym.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
