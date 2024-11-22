/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14ejercicios.Numero2;

/**
 *
 * @author yoven
 */
// Esta clase es parecida a Estudiante, pero representa a un profesor
// Tambien hereda de Persona
public class Profesor extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un profesor y estoy enseñando");
    }
}
