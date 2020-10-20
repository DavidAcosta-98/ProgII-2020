/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

import autores.modelos.Autor;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author David Acosta
 */
public class Grupo {
    private String nombre;
    private String descripcion;
    ArrayList <MiembroEnGrupo> miembros = new ArrayList<>();
    
//    private MiembroEnGrupo miembroEnGrupo;

    public Grupo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public void mostrar(){
        System.out.println("Datos del grupo: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Miembros: ");
        for(MiembroEnGrupo m : miembros)
         
        System.out.println("****************************************");
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String verDescripcion() {
        return descripcion;
    }

    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.nombre);
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
        final Grupo other = (Grupo) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    public ArrayList<MiembroEnGrupo> verMiembros() {
        return miembros;
    }

    public void agregarMiembro(Autor autor , Rol rol) {
       MiembroEnGrupo meg = new MiembroEnGrupo(autor,this,rol);
       
       if(!miembros.contains(meg))
          miembros.add(meg);
       
       if(this.nombre == "Super Administradores"){
           if (rol == Rol.ADMINISTRADOR);
                miembros.add(meg);
       }
     }
    
    
    public void quitarMiembro(Autor miembro){
        
        miembros.remove(miembro);
        
    }
    
    public boolean esSuperAdministradores(){
    
        if(this.nombre == "Super Administradores"){
           return true;
        }else 
            return false;
    }
    
    public boolean tieneMiembros(){
    
        if(!miembros.isEmpty())
            return true;
        else 
            return false;
    } 

    
    }
