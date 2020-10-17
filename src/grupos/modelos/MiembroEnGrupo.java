/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

import autores.modelos.Profesor;

/**
 *
 * @author David Acosta
 */
public class MiembroEnGrupo {
    
    private Grupo unGrupo;
    private Profesor unProfesor;
    private Rol rol;

    public MiembroEnGrupo(Grupo unGrupo, Profesor unProfesor, Rol rol) {
        this.unGrupo = unGrupo;
        this.unProfesor = unProfesor;
        this.rol = rol;
    }
 
    public Grupo getUnGrupo() {
        return unGrupo;
    }

    public void setUnGrupo(Grupo unGrupo) {
        this.unGrupo = unGrupo;
    }

    public Profesor getUnProfesor() {
        return unProfesor;
    }

    public void setUnProfesor(Profesor unProfesor) {
        this.unProfesor = unProfesor;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
    
    
}
