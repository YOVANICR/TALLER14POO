/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14ejercicios.Numero2;

/**
 *
 * @author yoven
 */
// En esta clase pruebo como funciona el polimorfismo con Persona
public class PruebaPersonas {
    public static void main(String[] args) {
        Persona[] personas = new Persona[3]; // Guardo diferentes tipos de personas en un arreglo
        personas[0] = new Persona(); 
        personas[1] = new Estudiante();
        personas[2] = new Profesor(); 

        // Recorro las personas y hago que se presenten
        for (Persona persona : personas) {
            persona.presentarse(); // Cada una usa su propio metodo presentarse
        }
    }
}
