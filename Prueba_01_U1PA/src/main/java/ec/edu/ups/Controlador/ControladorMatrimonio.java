/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Controlador;

import ec.edu.ups.Modelo.Matrimonio;

/**
 *
 * 
 *
 */
public class ControladorMatrimonio  extends  Controlador<Matrimonio>{

        public ControladorMatrimonio(String ruta) {
       // super(ruta);
    }

    
    @Override
    public boolean validar(Matrimonio obj) {
        
        if(obj.getContrayente_N1().getEstadoCivil().equalsIgnoreCase("Casado") || obj.getContrayente_N2().getEstadoCivil().equalsIgnoreCase("Casado") ){
            return false;
        }
        return true;
    }
    
    public int cargarCodigo(){
        if (findAll().size() > 0) {
            return findAll().size() + 1;
        } else {
            return 1;
        }
    }
        
}
