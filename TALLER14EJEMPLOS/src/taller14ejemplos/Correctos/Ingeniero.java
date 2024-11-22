/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14ejemplos.Correctos;

/**
 *
 * @author yoven
 */
// Similar a la clase Gerente, hice esta clase Ingeniero. Mi idea fue mostrar otro tipo
// de empleado con un rol especifico. En este caso, los ingenieros suelen enfocarse mas en diseño y desarrollo.
public class Ingeniero extends Empleado {

    // Aqui sobrescribi el metodo trabajar para que representara lo que hace un ingeniero.
    @Override
    public void trabajar() {
        System.out.println("El ingeniero esta diseñando");
    }
}
