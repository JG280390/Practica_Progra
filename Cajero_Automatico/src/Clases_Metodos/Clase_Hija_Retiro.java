
package Clases_Metodos;

import javax.swing.JOptionPane;

    
public class Clase_Hija_Retiro extends Clase_Padre {

    @Override
    public void Transacciones() {

        //int cantidad_retiro = Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite la cantidad desea retirar"));
        //float cantidad_retiro = Float.parseFloat(JOptionPane.showInputDialog(null,"Dijite la cantidad desea retirar"));
        //if (cantidad_retiro > saldo) {
        //setSaldo((int) (saldo - cantidad_retiro));
        //JOptionPane.showMessageDialog(null, "RETIRASTE : " + cantidad_retiro);
        //JOptionPane.showMessageDialog(null, "TU SALDO ACTUAL ES : " + getSaldo());
        //  JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE");
        //} else {
        //   JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE");
        // }
        int cantidad_retiro = Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite la cantidad del Retiro"));
        //float cantidad_retiro = Float.parseFloat(JOptionPane.showInputDialog(null,"Dijite la cantidad desea retirar"));
        if(cantidad_retiro>saldo){
            JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE");
        }else{
            setSaldo((saldo-cantidad_retiro));
             JOptionPane.showMessageDialog(null, "TU SALDO ACTUAL ES : " + getSaldo());
        }
       
    }

}
