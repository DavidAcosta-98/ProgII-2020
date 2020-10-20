/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

import java.util.Objects;

/**
 *
 * @author David Acosta
 */
public class Alumno extends Autor {

    private String cx;

    public Alumno(int dni, String apellidos, String nombres, String clave, String cx) {
        super(dni, apellidos, nombres, clave);
        this.cx = cx;
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println("CX: " + cx);
        System.out.println("****************************************");
    }

    public String verCx() {
        return cx;
    }

    public void asignarCx(String cx) {
        this.cx = cx;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.cx);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
       
        super.equals(obj);
        
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.cx, other.cx)) {
            return false;
        }
        return true;
    }

    
}
