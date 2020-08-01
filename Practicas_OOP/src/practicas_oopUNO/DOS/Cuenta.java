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
public class Cuenta {
    
    private String titular;
    private double importe;

    public Cuenta(String Titular, double Importe) {
        this.titular = Titular;
        this.importe = Importe;
    }
    
    public void ingresar(double Importe){
        if(importe > 0){
            this.importe =+Importe;
        }
    }
    public void retirar(double Importe){
        if(this.importe - importe < 0){
            this.importe = 0;
            
        }else{
            this.importe -= Importe;
        }
    }
    @Override
    public String toString(){
        
        return "El titular " + titular + " Tiene unsaldo de : " + importe;
    }
    
}
