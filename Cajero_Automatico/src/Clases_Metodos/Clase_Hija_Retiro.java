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
        int retirar = Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite la cantidad del Retiro"));
        setSaldo(saldo - retirar);
        JOptionPane.showMessageDialog(null, "TU SALDO ACTUAL ES : " + getSaldo());
    }

}
