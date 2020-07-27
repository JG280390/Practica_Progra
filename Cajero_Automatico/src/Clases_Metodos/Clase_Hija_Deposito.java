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
        JOptionPane.showMessageDialog(null,"CUANTO DESEAS DEPOSITAR");//linea 1 nueva
        
        this.Deposito();
        transacciones =getSaldo();
        setSaldo(transacciones + deposito);
        /*System.out.println("********************************************");
        System.out.println("DEPOSITASTE: " + deposito);
        System.out.println("TU SALDO ACTUAL ES : " +getSaldo());
        System.out.println("********************************************");
        */
        JOptionPane.showMessageDialog(null,"DEPOSITASTE: " + deposito);//linea 2 nueva
        JOptionPane.showMessageDialog(null,"TU SALDO ACTUAL ES : " +getSaldo());//linea 3 nueva
    }
    
}
