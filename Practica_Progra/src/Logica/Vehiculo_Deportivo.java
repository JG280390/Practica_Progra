package Logica;


import Logica.Vehiculo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jserranog
 */
public class Vehiculo_Deportivo extends Vehiculo {
    private int cilindraje;
    
    public Vehiculo_Deportivo(int cilindraje,String Matricula, String Marca, String Modelo) {
        super(Matricula, Marca, Modelo);
        this.cilindraje=cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }
    
    @Override
    public String Mostrardatos(){
       return "Matricula: "+Matricula+"\nMarca: "+Marca+"\nModelo: "+Modelo+
                "\n"+cilindraje;
    }
}
