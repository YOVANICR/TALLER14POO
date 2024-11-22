/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14ejercicios.Numero2;

/**
 *
 * @author yoven
 */
// Ahora hago una clase Estudiante que hereda de Persona
// Tiene sentido porque un estudiante es una persona
public class Estudiante extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un estudiante y estoy estudiando");
    }
}
