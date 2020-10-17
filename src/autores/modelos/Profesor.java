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
public class Profesor {
    private int dni;
    private String apellidos;
    private String nombres;
    private String clave;
    private String codigo;
    private Cargo cargos;
    ArrayList <MiembroEnGrupo> miembros = new ArrayList<>();

    // Verificar que "Codigo" este en el controlador principal.
    
    public Profesor(int dni, String apellidos, String nombres, String clave, Cargo cargos) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.clave = clave;
        //this.codigo = codigo;
        this.cargos = cargos;
    }
    
    public void mostrar(){
        System.out.println("Datos del Profesor: ");
        System.out.println("DNI: " + dni);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Nombres: " + nombres);
        System.out.println("Clave: " + clave);
        System.out.println("Codigo: " + codigo);
        System.out.println("Cargo: " + cargos);
        System.out.println("****************************************");
    }    

    //Probar si es que tienen sentido 
    public Cargo verCargos() {
        return cargos;
    }

    public void asignarCargos(Cargo cargos) {
        this.cargos = cargos;
    }
 
    public int verDni() {
        return dni;
    }

    public void asignarDni(int dni) {
        this.dni = dni;
    }

    public String verApellidos() {
        return apellidos;
    }

    public void asignarApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String verNombres() {
        return nombres;
    }

    public void asignarNombres(String nombres) {
        this.nombres = nombres;
    }

    public String verClave() {
        return clave;
    }

    public void asignarClave(String clave) {
        this.clave = clave;
    }

    public String verCodigo() {
        return codigo;
    }

    public void asignarCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
