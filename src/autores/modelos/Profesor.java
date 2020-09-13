/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

/**
 *
 * @author David Acosta
 */
public class Profesor {
    int dni;
    String apellidos;
    String nombres;
    String clave;
    String codigo;
    
    void mostrar(){
        System.out.println("Datos del alumno: ");
        System.out.println("DNI: " + dni);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Nombres: " + nombres);
        System.out.println("Clave: " + clave);
        System.out.println("Codigo: " + codigo);
    }    
}
