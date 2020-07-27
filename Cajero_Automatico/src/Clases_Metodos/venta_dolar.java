/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_Metodos ;

import javax.swing.JOptionPane;

/**
 *
 * @author jserranog
 */
public class venta_dolar extends Clase_Padre{
    private String jventa_dolar;
    private int jresultado;

    public String getJventa_dolar() {
        return jventa_dolar;
    }

    public void setJventa_dolar(String jventa_dolar) {
        this.jventa_dolar = jventa_dolar;
    }

    public int getJresultado() {
        return jresultado;
    }

    public void setJresultado(int jresultado) {
        this.jresultado = jresultado;
    }

    @Override
    public void Transacciones() {
        JOptionPane.showMessageDialog(null,"CUANTO DOLARES DESEA CAMBIAR");
        int cantidad=Integer.parseInt(JOptionPane.showInputDialog(null,"Dijite la cantidad de dolares que desea comprar"));///esto para capturar datos
        JOptionPane.showMessageDialog(null,"La cantidad a pagar en colones es : "+cantidad*580);
        //this.setCompra_dolares(compra_dolares);
    }

    public void setCompra_dolares(int compra_dolares) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
