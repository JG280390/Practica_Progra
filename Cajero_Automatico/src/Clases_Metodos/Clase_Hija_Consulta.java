
package Clases_Metodos;

import javax.swing.JOptionPane;


/**
 *
 * @author jserranog
 */
public class Clase_Hija_Consulta extends Clase_Padre{
    
    @Override
    public void Transacciones(){//polimorfismo tener metodos iguales pero que se comporten distintos
        //System.out.println("**********************************************");
        //System.out.println("TU SALDO ACTUAL ES : " +getSaldo());
        //System.out.println("**********************************************");
        //JOptionPane.showMessageDialog(null,"**********************************************");
        JOptionPane.showMessageDialog(null,"TU SALDO ACTUAL ES : " +getSaldo());
        //JOptionPane.showMessageDialog(null,"**********************************************");
    }
    
}
