/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

import grupos.modelos.MiembroEnGrupo;
import java.util.ArrayList;

/**
 *
 * @author David Acosta
 */
public class Profesor extends Autor {

    private Cargo cargos;
    ArrayList <MiembroEnGrupo> miembros = new ArrayList<>();
   
    public Profesor(int dni, String apellidos, String nombres, String clave, Cargo cargos) {
        super(dni, apellidos, nombres, clave);
        this.cargos = cargos;
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Cargo: " + cargos);
        System.out.println("****************************************");
    }    

    public Cargo verCargos() {
        return cargos;
    }

    public void asignarCargos(Cargo cargos) {
        this.cargos = cargos;
    }
   
}
