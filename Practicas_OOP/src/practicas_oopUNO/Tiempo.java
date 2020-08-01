/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas_oopUNO;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import practicas_oopUNO.Tiempo_Reloj;
/**
 *
 * @author jserranog
 */
public class Tiempo extends Thread{
    private int hora;
    private int minutos;
    private int segundos;
    
    private final JLabel lbl;
    Calendar cal =new GregorianCalendar().getInstance();

    public Tiempo(JLabel lbl) {
        this.lbl=lbl;
    }
 
    @Override
    public void run() {
        cal.roll(Calendar.HOUR, 0);//sumarle a la hora
        
        while (true) {
            Date hoy=new Date();
            SimpleDateFormat sdt1 =new SimpleDateFormat("hh:mm::ss");
            SimpleDateFormat sdt2 =new SimpleDateFormat("hh:mm::ss");
            lbl.setText(sdt1.format(hoy));
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }

    
    

   
}

    

