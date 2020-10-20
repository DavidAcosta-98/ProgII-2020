/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomas.modelos;

import java.util.Objects;

/**
 *
 * @author David Acosta
 */
public class Idioma {
    private String nombre;

    public Idioma(String nombre) {
        this.nombre = nombre;
    }

    public void mostrar (Idioma unIdioma){
        System.out.println(unIdioma);
        System.out.println("****************************************");
    }
    
    @Override
    public String toString() {
        return "Idioma: " + nombre;
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Idioma other = (Idioma) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    
    
}
