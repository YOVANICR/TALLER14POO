/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14ejercicios.Numero1;

/**
 *
 * @author yoven
 */

// Aqui creo una clase Rectangulo que tambien hereda de Figura
public class Rectangulo extends Figura {
    private double largo; 
    private double ancho; 

    // Constructor para inicializar los valores de largo y ancho
    public Rectangulo(double largo, double ancho) {
        this.largo = largo; // Asigno el largo que recibo como parametro
        this.ancho = ancho; // Asigno el ancho que recibo como parametro
    }

    // Sobrescribo el metodo calcularArea con la formula especifica para un rectangulo
    @Override
    public void calcularArea() {
        double area = largo * ancho; // Aqui uso la formula del area de un rectangulo
        System.out.println("El area del rectangulo es: " + area); // Muestro el resultado en la consola
    }
}
