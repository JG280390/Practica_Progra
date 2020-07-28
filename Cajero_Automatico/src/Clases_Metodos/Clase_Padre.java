package Clases_Metodos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jserranog
 */
public abstract class Clase_Padre {

    protected int transacciones, retiro, deposito, compra_dolares, venta_dolares;
    static int saldo=10000;
    Scanner capturas = new Scanner(System.in);

    public void Menu()
    {
     int bandera = 0;
     int seleccion = 0;
     do{
     do
     {
         System.out.println(" Seleccione una opcion");
         System.out.println("    1. Consulta de Saldo");
         System.out.println("    2.  Retiro");
         System.out.println("    3.  Deposito");
         System.out.println("    4. Compra de dolares");
         System.out.println("    5. Venta de dolares");
         System.out.println("    6. Salir");
         seleccion = capturas.nextInt();
         if(seleccion >=1 && seleccion <=6)
         {
             bandera = 1;
         }else
         {
             System.out.println("------------------------");
             System.out.println("La opcion no existe");
             System.out.println("------------------------");
         }
     }while(bandera == 0);
     
     if(seleccion == 1)
     {
         Clase_Padre mensajero = new Clase_Hija_Consulta(); 
         mensajero.Transacciones();
         
     }else if(seleccion == 2)
      {
         Clase_Padre mensajero = new Clase_Hija_Retiro();
         mensajero .Transacciones();
      }else if(seleccion == 3)
      {
            Clase_Padre mensajero = new Clase_Hija_Deposito();
            mensajero.Transacciones();
      }else if(seleccion == 4)
      {
          
      }else if(seleccion == 5)
      {
          venta_dolar mensajero= new venta_dolar();
          mensajero.Transacciones();
          
      }else if(seleccion == 6)
      {
          System.out.println("-----------------------------");
          System.out.println("GRACIAS, VUELVA PRONTO");
          System.out.println("-----------------------------");
          bandera = 2;
      }
     
    }while(bandera !=2);// para que se repita toso
     
     }
   

    public void Retiro() {

        retiro = capturas.nextInt();

    }

    public int getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(int transacciones) {
        this.transacciones = transacciones;
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    public void Deposito() {
        deposito = capturas.nextInt();
    }

    public abstract void Transacciones();

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getCompra_dolares() {
        return compra_dolares;
    }

    public void setCompra_dolares(int compra_dolares) {
        this.compra_dolares = compra_dolares;
    }

    public int getVenta_dolares() {
        return venta_dolares;
    }

    public void setVenta_dolares(int venta_dolares) {
        this.venta_dolares = venta_dolares;
    }

}
