/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14ejemplos.Correctos;

/**
 *
 * @author yoven
 */
// Esta es la clase donde hago la prueba principal. Mi objetivo aqui era demostrar
// como el polimorfismo me permite usar una misma referencia para objetos diferentes.
public class PruebaPolimorfismo {
    public static void main(String[] args) {
        // Aqui cree un objeto empleado1, pero le asigne un gerente. Esto me permite
        // usar la misma referencia para diferentes tipos de empleados.
        Empleado empleado1 = new Gerente();

        // Este otro es un ingeniero, pero lo manejo de la misma forma que el gerente.
        Empleado empleado2 = new Ingeniero();

        // Llamo al metodo trabajar y segun el objeto que use, el comportamiento cambia.
        empleado1.trabajar(); // Deberia mostrar el gerente esta gestionando el equipo
        empleado2.trabajar(); // Deberia mostrar el ingeniero esta diseñando
    }
}
