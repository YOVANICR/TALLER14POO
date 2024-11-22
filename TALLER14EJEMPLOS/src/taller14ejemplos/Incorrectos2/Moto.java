/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14ejemplos.Incorrectos2;

/**
 *
 * @author yoven
 */
// Cree la clase Moto, que hereda de Vehiculo. Decidi sobrescribir el metodo mover,
// pero luego me di cuenta de que no estaba cambiando nada del comportamiento original.
public class Moto extends Vehiculo {

    // Sobrescribi el metodo mover, pero en realidad solo llame al metodo de la clase base.
    // Esto es innecesario porque no estoy agregando nada nuevo.
    @Override
    public void mover() {
        super.mover(); // Esto hace lo mismo que el metodo original, asi que no tiene sentido sobrescribirlo
    }
}
