/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14ejercicios.Numero3;

/**
 *
 * @author yoven
 */
// Aqui pruebo algo que no se puede hacer con polimorfismo
public class PruebaPolimorfismoIncorrecto {
    public static void main(String[] args) {
        Animal miAnimal = new Perro(); // Uso polimorfismo para crear un objeto Perro

        // Intento llamar a un metodo que no esta en la clase base
        // miAnimal.correr(); // Esto genera un error porque el metodo correr no existe en Animal
        System.out.println("No puedo usar miAnimal para llamar al metodo correr porque no esta definido en Animal");
    }
}
