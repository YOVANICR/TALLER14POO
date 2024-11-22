/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14ejercicios.Numero4;

/**
 *
 * @author yoven
 */
// La clase Bicicleta tambien hereda de Vehiculo
// Especifico como se mueve una bicicleta
public class Bicicleta extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("La bicicleta se esta moviendo lentamente");
    }
}
