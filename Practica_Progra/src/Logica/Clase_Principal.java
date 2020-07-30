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
public class Clase_Principal {
    public static void main(String[] args) {
         String user, pass, repass;
    
    user="Serrano";
    pass="28031990";
    repass="28031990";
    
    Verificacion h= new Verificacion();
    
    try{
        h.validarPassword(pass,repass);
        
    }catch(CustomException e)  {
        System.out.println("No se puede registrar el usuario. Debido al siguiente problema: " + e.getMessage());
    }
            
    
        
        Vehiculo misVehiculos[] = new Vehiculo[4];
        
        misVehiculos[0]=new Vehiculo("BFL-149","Hunday","2014") {};//
        misVehiculos[1]=new Vehiculo_Turista(4,"AAA-000","Toyota","2010");//polimorfismo
        misVehiculos[2]=new Vehiculo_Deportivo(500,"BBB-111","Nissan","2018");
        misVehiculos[3]=new Vehiculo_Carga(400,"JJJ-222","Detroid","2000");
        
        for (Vehiculo vehiculo: misVehiculos) {
            System.out.println(vehiculo.Mostrardatos());
            System.out.println("");
            
        }

  
   }
}
