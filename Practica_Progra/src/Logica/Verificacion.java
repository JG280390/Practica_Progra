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
class Verificacion {
    public void validarPassword(String pass, String rpass) throws CustomException{
        if(!pass.equals(rpass)){
            throw new CustomException("Los campos de los password no coinsiden..");            
        }
        
        if(pass.length()< 8){
            throw new CustomException("El password no puede ser menor a 8 caracteres...");
        }
        
      
    }
}
