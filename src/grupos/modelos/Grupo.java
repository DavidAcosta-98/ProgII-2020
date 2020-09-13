/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

/**
 *
 * @author David Acosta
 */
public class Grupo {
    String nombre;
    String descripcion;
    
    void mostrar(){
        System.out.println("Datos del grupo: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripcion: " + descripcion);
    }
}
