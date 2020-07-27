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
public class Compra_Dolares extends Clase_Padre{

    @Override
    public void Transacciones() {
       // JOptionPane.showMessageDialog(null,"CUANTO DOLARES DESEA CAMBIAR");
        int cantidad=Integer.parseInt(JOptionPane.showInputDialog(null,"Dijite la cantidad de dolares que desea Vender"));///esto para capturar datos
        JOptionPane.showMessageDialog(null,"La cantidad apagarle por los dolares : " +cantidad*570);
    }
    
}
