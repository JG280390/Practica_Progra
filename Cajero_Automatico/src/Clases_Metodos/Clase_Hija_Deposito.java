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
public class Clase_Hija_Deposito extends Clase_Padre{
    @Override
    public void Transacciones(){
        //System.out.println("CUANTO DESEAS DEPOSITAR");
        //JOptionPane.showMessageDialog(null,"CUANTO DESEAS DEPOSITAR");//linea 1 nueva
        //int saldo_actual=10000;
        int ingreso=Integer.parseInt(JOptionPane.showInputDialog(null,"Dijite la cantidad del deposito"));
        setSaldo(saldo+ingreso);
       JOptionPane.showMessageDialog(null,"TU SALDO ACTUAL ES : " +getSaldo());
    }
    
}
