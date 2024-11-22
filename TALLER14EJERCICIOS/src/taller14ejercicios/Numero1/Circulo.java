/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14ejercicios.Numero1;

/**
 *
 * @author yoven
 */

// Aqui defino una clase llamada Circulo que hereda de Figura
public class Circulo extends Figura {
    private double radio; // Aqui creo un atributo para guardar el radio del circulo

    // Constructor para inicializar el radio del circulo
    public Circulo(double radio) {
        this.radio = radio; // Asigno el valor del radio que recibo como parametro
    }

    // Sobrescribo el metodo calcularArea para implementar la formula especifica de un circulo
    @Override
    public void calcularArea() {
        double area = Math.PI * radio * radio; // Esta es la formula que uso para calcular el area de un circulo
        System.out.println("El area del circulo es: " + area); // Aqui imprimo el resultado del calculo
    }
}
