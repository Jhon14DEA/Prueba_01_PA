/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.Controlador;

import ec.edu.ups.Modelo.Autoridad;
import java.util.List;

/**
 * 
 * 
 */
public class ControladorAutoridad extends Controlador<Autoridad>{
    
       public ControladorAutoridad(String ruta) {
        //super(ruta);
    }

    @Override
    public boolean validar(Autoridad obj) {
        return true;
    }
    
    public Autoridad iniciarSesion(String correo, String contrase) {
        for (var autoridad : (List<Autoridad>) findAll()) {
            if (autoridad.getCorreo().equals(correo) && autoridad.getContraseña().equals(contrase)) {
                return autoridad;
            }
        }
        return null; 
   }
    
    
    

}
