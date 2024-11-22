/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14ejercicios.Numero1;

/**
 *
 * @author yoven
 */
// Clase de prueba para demostrar el polimorfismo usando la clase base Figura
public class PruebaFiguras {
    public static void main(String[] args) {
        // Creo un arreglo de tipo Figura para guardar diferentes figuras
        Figura[] figuras = new Figura[2];
        figuras[0] = new Circulo(5); // Creo un circulo con radio 5
        figuras[1] = new Rectangulo(4, 3); // Creo un rectangulo de 4x3

        // Uso un bucle para calcular el area de cada figura en el arreglo
        for (Figura figura : figuras) {
            figura.calcularArea(); 
        }
    }
}

