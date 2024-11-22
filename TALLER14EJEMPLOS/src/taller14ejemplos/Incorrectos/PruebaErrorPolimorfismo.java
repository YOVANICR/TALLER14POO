/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14ejemplos.Incorrectos;

/**
 *
 * @author yoven
 */
// En esta clase hago una prueba para demostrar un error que ocurre cuando intentamos usar
// metodos que no existen en la clase base.
public class PruebaErrorPolimorfismo {
    public static void main(String[] args) {
        // Cree una referencia de tipo Animal, pero le asigne un objeto Perro.
        // Esto es valido porque Perro hereda de Animal.
        Animal miAnimal = new Perro();

        // Este es el error: estoy intentando llamar al metodo correr, pero como no esta definido en Animal,
        // el compilador no lo reconoce aunque miAnimal sea un Perro.
        // miAnimal.correr(); // Esto genera error porque correr no es parte de Animal
    }
}
