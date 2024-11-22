/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14ejercicios.Numero3;

/**
 *
 * @author yoven
 */
// Esta clase representa a un perro, que es un tipo de animal
public class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }

    // Este metodo es exclusivo del perro, no existe en la clase base
    public void correr() {
        System.out.println("El perro esta corriendo");
    }
}
