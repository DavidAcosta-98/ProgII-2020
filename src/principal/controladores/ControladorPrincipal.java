/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;

import autores.vistas.VentanaAMAlumno;
import autores.vistas.VentanaAMProfesor;
import grupos.vistas.VentanaAMGrupo;
import idiomas.vistas.VentanaAIdioma;
import lugares.vistas.VentanaALugar;
import palabrasclaves.vistas.VentanaAPalabraClave;
import tipos.vistas.VentanaATipo;

/**
 *
 * @author David Acosta
 */
public class ControladorPrincipal {
    
    public static void main(String[] args) {
        
//        ArrayList <Alumno> alumnos = new ArrayList<>();
//        ArrayList <Profesor> profesores = new ArrayList<>();
//        ArrayList <PalabraClave> palabras = new ArrayList<>();
//        ArrayList <Idioma> idiomas = new ArrayList<>();    
//        ArrayList <Lugar> lugares = new ArrayList<>();
//        ArrayList <Tipo> tipos = new ArrayList<>();
//        ArrayList <Grupo> grupos = new ArrayList<>();
//           
//        Alumno alumno1 = new Alumno(78728722, "acosta", "david", "coma", "1234567");
//        Alumno alumno2 = new Alumno (41644109, "avalos", "andrea", "gato", "4673733");
//        Alumno alumno3 = new Alumno (12345677, "pancracio", "pepe", "boludo", "345678");
//        Alumno alumno4 = new Alumno (76543211, "cassas", "paola", "hola", "8765234");
//        Alumno alumno5 = new Alumno (12345677, "puertas", "horacio", "gei", "4565678");
//        
//        Profesor profesor1 = new Profesor (45263658, "Pantriste","Ronaldo","Soycristiano","145796"); 
//        Profesor profesor2 = new Profesor (45264588, "Rodriguez","Ronal","yella","14545646");
//        Profesor profesor3 = new Profesor (45125658, "Hernandez","mariano","teclao","1436216");
//        Profesor profesor4 = new Profesor (41243658, "ROberto","jose","Soyciruja","141548");
//        Profesor profesor5 = new Profesor (14863658, "ramon","enrique","parlante","255796");
//    
//        PalabraClave palabra1 = new PalabraClave ("pito");
//        PalabraClave palabra2 = new PalabraClave ("horno");
//        PalabraClave palabra3 = new PalabraClave ("casa");
//        PalabraClave palabra4 = new PalabraClave ("compu");
//        PalabraClave palabra5 = new PalabraClave ("pan");
//        
//        Idioma idioma1 = new Idioma ("español");
//        Idioma idioma2 = new Idioma ("espanglish");
//        Idioma idioma3 = new Idioma ("ruso");
//        Idioma idioma4 = new Idioma ("aleman");
//        Idioma idioma5 = new Idioma ("Japones");
//        
//        Lugar lugar1 = new Lugar ("revista");
//        Lugar lugar2 = new Lugar ("libro");
//        Lugar lugar3 = new Lugar ("web");
//        Lugar lugar4 = new Lugar ("diario");
//        Lugar lugar5 = new Lugar ("tombola");
//        
//        Tipo tipo1 = new Tipo("tesis");
//        Tipo tipo2 = new Tipo("libro");
//        Tipo tipo3 = new Tipo("Capitulo de un libro");
//        Tipo tipo4 = new Tipo("Articulo de diario");
//        Tipo tipo5 = new Tipo("Final de anatomia");
//        
//        Grupo grupo1 = new Grupo("los petes", "pt");
//        Grupo grupo2 = new Grupo("zapato", "no hacemos nada");
//        Grupo grupo3 = new Grupo("los facha", "smirnof");
//        Grupo grupo4 = new Grupo("los tinchos", "franco");
//        Grupo grupo5 = new Grupo("los amigos", "hola wenas");
//        
//        alumnos.add(alumno1);
//        alumnos.add(alumno2);
//        alumnos.add(alumno3);
//        alumnos.add(alumno4);
//        alumnos.add(alumno5);
//        
//        profesores.add(profesor1);
//        profesores.add(profesor2);
//        profesores.add(profesor3);
//        profesores.add(profesor4);
//        profesores.add(profesor5);
//        
//        palabras.add(palabra1);
//        palabras.add(palabra2);
//        palabras.add(palabra3);
//        palabras.add(palabra4);
//        palabras.add(palabra5);
//        
//        idiomas.add(idioma1);
//        idiomas.add(idioma2);
//        idiomas.add(idioma3);
//        idiomas.add(idioma4);
//        idiomas.add(idioma5);
//        
//        lugares.add(lugar1);
//        lugares.add(lugar2);
//        lugares.add(lugar3);
//        lugares.add(lugar4);
//        lugares.add(lugar5);
//        
//        tipos.add(tipo1);
//        tipos.add(tipo2);
//        tipos.add(tipo3);
//        tipos.add(tipo4);
//        tipos.add(tipo5);
//        
//        grupos.add(grupo1);
//        grupos.add(grupo2);
//        grupos.add(grupo3);
//        grupos.add(grupo4);
//        grupos.add(grupo5);
//        
//        for(Alumno unAlumno : alumnos)
//            unAlumno.mostrar();
//        
//        for(Profesor unProfesor : profesores)
//            unProfesor.mostrar();
//        
//        for(PalabraClave unaPalabra : palabras)
//            unaPalabra.mostrar(unaPalabra);
//        
//        for (Idioma unIdioma : idiomas)
//            unIdioma.mostrar(unIdioma);
//        
//        for (Lugar unLugar : lugares)
//            unLugar.mostrar(unLugar);
//        
//        for (Tipo unTipo : tipos)
//            unTipo.mostrar(unTipo);
//        
//        for (Grupo unGrupo : grupos)
//            unGrupo.mostrar();
        
        VentanaAMAlumno ventanaAlum = new VentanaAMAlumno(null);
        ventanaAlum.setLocationRelativeTo(null);
        ventanaAlum.setVisible(true);
        
        VentanaAMProfesor ventanaProf = new VentanaAMProfesor(null);
        ventanaProf.setLocationRelativeTo(null);
        ventanaProf.setVisible(true);
        
        VentanaAMGrupo ventanaGrup = new VentanaAMGrupo (null);
        ventanaGrup.setLocationRelativeTo(null);
        ventanaGrup.setVisible(true);
        
        VentanaAIdioma ventanaIdioma = new VentanaAIdioma (null);
        ventanaIdioma.setLocationRelativeTo(null);
        ventanaIdioma.setVisible(true);
        
        VentanaALugar ventanaLu = new VentanaALugar (null);
        ventanaLu.setLocationRelativeTo(null);
        ventanaLu.setVisible(true);
        
        VentanaAPalabraClave ventanaPalab = new VentanaAPalabraClave (null);
        ventanaPalab.setLocationRelativeTo(null);
        ventanaPalab.setVisible(true);
        
        VentanaATipo ventanaTipo = new VentanaATipo (null);
        ventanaTipo.setLocationRelativeTo(null);
        ventanaTipo.setVisible(true);
    }

}
