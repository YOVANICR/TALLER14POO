/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14ejemplos.Incorrectos;

/**
 *
 * @author yoven
 */
// Aqui cree la clase Perro, que hereda de Animal. Decidi agregar un metodo especifico llamado correr
// porque los perros tienen comportamientos propios que no necesariamente aplican a todos los animales.
public class Perro extends Animal {

    // Este metodo lo agregue pensando en que solo los perros pueden usarlo,
    // pero no lo inclui en la clase base porque no todos los animales corren.
    public void correr() {
        System.out.println("El perro esta corriendo");
    }
}
