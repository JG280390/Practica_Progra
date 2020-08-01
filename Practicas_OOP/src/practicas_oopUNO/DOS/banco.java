/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas_oopUNO.DOS;

/**
 *
 * @author jserranog
 */
public class banco {

    public static void main(String[] args) {
        //Cuenta cuentacolones[] = new Cuenta[5];

        //String variascuentas[] = new String[5];
        Cuenta cuentacolones = new Cuenta("juan", 20000);
        Cuenta cuentaDolares = new Cuenta("mario", 50000);
        cuentacolones.ingresar(10000);
        cuentaDolares.ingresar(200);
        //cuentacolones[0].retirar(10);
        // cuentacolones.retirar(5000);
        //mostrar
        System.out.println(cuentacolones);
    }
}
