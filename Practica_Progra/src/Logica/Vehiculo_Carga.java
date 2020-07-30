/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author jserranog
 */
public class Vehiculo_Carga extends Vehiculo{
    private int carga;
    
    public Vehiculo_Carga(int carga,String Matricula, String Marca, String Modelo) {
        super(Matricula, Marca, Modelo);
       
        this.carga=carga;
    }

    public int getCarga() {
        return carga;
    }
    
    @Override
    public String Mostrardatos(){
       return "Matricula: "+Matricula+"\nMarca: "+Marca+"\nModelo: "+Modelo+
               "\n"+carga;
    }
    
}
