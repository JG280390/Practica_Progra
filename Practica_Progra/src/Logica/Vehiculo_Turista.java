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
public class Vehiculo_Turista extends Vehiculo {
    
    private int Npuertas;

    public Vehiculo_Turista(int Npuertas,String Matricula, String Marca, String Modelo) {
        super(Matricula, Marca, Modelo);
        this.Npuertas = Npuertas;
    }
    
    public int getNpuertas(){
        return Npuertas;
    }
    
    @Override
    public String Mostrardatos(){
        return "Matricula: "+Matricula+"\nMarca: "+Marca+"\nModelo: "+Modelo+
                "\nNumero de puertas: "+Npuertas;
    }
}
