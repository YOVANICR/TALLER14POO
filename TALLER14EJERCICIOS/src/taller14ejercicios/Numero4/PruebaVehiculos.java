/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14ejercicios.Numero4;

/**
 *
 * @author yoven
 */
// Esta clase prueba como funciona el polimorfismo con Vehiculo
public class PruebaVehiculos {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[2]; // Guardo diferentes vehiculos en un arreglo
        vehiculos[0] = new Coche(); 
        vehiculos[1] = new Bicicleta(); 

        // Recorro los vehiculos y los hago moverse
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mover(); // Cada vehiculo usa su propio metodo mover
        }
    }
}
