/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

import autores.modelos.Alumno;
import autores.modelos.Autor;
import autores.modelos.Profesor;
import java.util.Objects;

/**
 *
 * @author David Acosta
 */
public class MiembroEnGrupo {
    
    private Grupo unGrupo;
//    private Profesor unProfesor;
//    private Alumno unAlumno;
    private Rol rol;
    private Autor autor;

//    public MiembroEnGrupo(Alumno alumno, Grupo unGrupo, Rol rol) {
//        this.unGrupo = unGrupo;
//        this.unAlumno = unAlumno;
//        this.rol = rol;
//    }
//
//    public MiembroEnGrupo(Profesor unProfesor, Grupo unGrupo, Rol rol) {
//        this.unGrupo = unGrupo;
//        this.unProfesor = unProfesor;
//        this.rol = rol;
//    }

    public MiembroEnGrupo(Autor autor, Grupo unGrupo, Rol rol) {
        this.unGrupo = unGrupo;
        this.rol = rol;
        this.autor = autor;
    }

  
    
    public Grupo getUnGrupo() {
        return unGrupo;
    }

    public void setUnGrupo(Grupo unGrupo) {
        this.unGrupo = unGrupo;
    }

//    public Profesor getUnProfesor() {
//        return unProfesor;
//    }
//
//    public void setUnProfesor(Profesor unProfesor) {
//        this.unProfesor = unProfesor;
//    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

//    public Alumno getUnAlumno() {
//        return unAlumno;
//    }
//
//    public void setUnAlumno(Alumno unAlumno) {
//        this.unAlumno = unAlumno;
//    }

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 53 * hash + Objects.hashCode(this.unProfesor);
//        hash = 53 * hash + Objects.hashCode(this.unAlumno);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final MiembroEnGrupo other = (MiembroEnGrupo) obj;
//        if (!Objects.equals(this.unProfesor, other.unProfesor)) {
//            return false;
//        }
//        if (!Objects.equals(this.unAlumno, other.unAlumno)) {
//            return false;
//        }
//        return true;
//    }
//    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.autor);
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
        final MiembroEnGrupo other = (MiembroEnGrupo) obj;
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }
    
    public void mostrar(){
        System.out.println("Autor: " + this.autor.getNombres() + ", " + );
        
    }
    
}
