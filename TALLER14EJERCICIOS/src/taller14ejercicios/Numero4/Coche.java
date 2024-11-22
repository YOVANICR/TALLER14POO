/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14ejercicios.Numero4;

/**
 *
 * @author yoven
 */
// La clase Coche hereda de Vehiculo
// Especifico como se mueve un coche
public class Coche extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("El coche se esta moviendo rapido");
    }
}
