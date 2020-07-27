/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_Metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author jserranog
 */
public class Clase_Hija_Retiro extends Clase_Padre {

    @Override
    public void Transacciones() {
        //System.out.print("CUANTO DESEAS RETIRAR: ");
       // JOptionPane.showMessageDialog(null,"CUANTO DESEAS RETIRAR " );
       int cantidad=Integer.parseInt(JOptionPane.showInputDialog(null,"Dijite la cantidad desea retirar"));
        this.Retiro();
        if (retiro <= getSaldo()) {
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            JOptionPane.showMessageDialog(null,"RETIRASTE : " + retiro );
            JOptionPane.showMessageDialog(null,"TU SALDO ACTUAL ES : " + getSaldo() );
        } else {
        
            JOptionPane.showMessageDialog(null,"SALDO INSUFICIENTE" );
        }
         //int cantidad=Integer.parseInt(JOptionPane.showInputDialog(null,"Dijite la cantidad desea retirar"));///esto para capturar datos
          // JOptionPane.showMessageDialog(null,"CUANTO DESEAS RETIRAR " );
         /*int getRetiro=Integer.parseInt(JOptionPane.showInputDialog(null,"CUANTO DESEAS RETIRAR"));;
         this.Retiro();
           if (retiro<= getSaldo()){ // no me esta dando porque no sabe cuanto tengo en la ceunta
                transacciones=getSaldo();
                setSaldo(transacciones - retiro);
                 JOptionPane.showMessageDialog(null,"Retiraste : " +retiro);
                JOptionPane.showMessageDialog(null,"TU SALDO ACTUAL"+getSaldo());
            }else
            {
                JOptionPane.showMessageDialog(null,"SALDO INSUFICIENTE" );
        
            }*/
        
    }
    
   

}
