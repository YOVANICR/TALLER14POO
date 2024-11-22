/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14ejemplos.Incorrectos2;

/**
 *
 * @author yoven
 */
// Esta clase es donde pruebo la clase Moto y demuestro que no tenia que sobrescribir el metodo mover.
public class PruebaUsoInnecesario {
    public static void main(String[] args) {
        // Cree un objeto Moto y llame al metodo mover.
        Moto miMoto = new Moto();
        miMoto.mover(); // Muestra que el vehiculo se esta moviendo
    }
}
