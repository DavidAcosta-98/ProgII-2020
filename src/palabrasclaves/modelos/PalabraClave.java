/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrasclaves.modelos;

import java.util.ArrayList;

/**
 *
 * @author David Acosta
 */
public class PalabraClave {
    
    private String nombre;
    
    public PalabraClave(String nombre) {
        this.nombre = nombre;
    }
   
    public void mostrar(PalabraClave palabra){
        System.out.println(palabra);
        System.out.println("****************************************");
    }
    
    @Override
    public String toString() {
        return "Palabra Clave: " + nombre;
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
     
}
