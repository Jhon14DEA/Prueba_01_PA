/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Controlador;



import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.io.*;


/**
 *
 * 
 * @param <E>
 */
public abstract class Controlador<E> {
    
   private List<E> listaGenerica;
       private String ruta = "Lista.dat"; 


    public Controlador() {
        listaGenerica = new ArrayList<>();
    }

    public boolean create(E objeto) {
        if(validar(objeto)==true){  
            return listaGenerica.add(objeto);
        }
        return false;
    }
    
    public E read(E comp){
        try{
            return listaGenerica.stream().filter(objeto->objeto.equals(comp)).findFirst().get();    
        }catch(Exception ex){} 
       return null;
    }
    
    public void update(E obj, E Eliminar) {
        int index = (listaGenerica.indexOf(Eliminar));
        listaGenerica.remove(index);
        listaGenerica.add(index, obj);
    }
    
    
    public void delete(E objeto) {
        listaGenerica.remove(objeto);
        System.out.println(listaGenerica);
    }
    
   

    public List<E> findAll() {
        return listaGenerica;
    }
    
    
    public abstract boolean validar(E obj);
    public int cargarCodigo(){
        if (findAll().size() > 0) {
            return findAll().size() + 1;
        } else {
            return 1;
        }
    }
     public String guardarArchivo() throws FileNotFoundException, IOException {
      FileOutputStream archivo = new FileOutputStream(ruta);
        ObjectOutputStream salida = new ObjectOutputStream(archivo);
        for (Object objeto : listaGenerica) {
            salida.writeObject(objeto);
        }
        archivo.close();
        return "Guardado exitoso !!!";
    }

    public String leerArchivo() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream archivo = new FileInputStream(ruta);
        ObjectInputStream entrada = new ObjectInputStream(archivo);
        try {
            while (true) {
                var objeto = (Object) entrada.readObject();
                listaGenerica.add((E) objeto);
            }
        } catch (Exception e) {
        } finally {
            entrada.close();
        }
        return "Lectura exitosa";
    }
   
}
