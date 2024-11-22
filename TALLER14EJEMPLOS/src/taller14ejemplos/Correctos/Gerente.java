/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14ejemplos.Correctos;

/**
 *
 * @author yoven
 */
// Aqui cree la clase Gerente, que hereda de Empleado. Quise sobrescribir el metodo trabajar
// porque los gerentes tienen responsabilidades muy diferentes a otros empleados.
public class Gerente extends Empleado {

    // Este metodo lo sobrescribi para reflejar que los gerentes no solo trabajan,
    // sino que tambien tienen que liderar equipos. Lo vi como algo mas especifico.
    @Override
    public void trabajar() {
        System.out.println("El gerente esta gestionando el equipo");
    }
}
