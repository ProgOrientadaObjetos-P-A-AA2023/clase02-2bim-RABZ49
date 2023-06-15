/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        // 1. Crear y presentar un obj de tipo Estudiante Presencial
        String nombre = "Roberto";
        String apellido = "Bustamante";
        String identificacion = "1105446544";
        int edad = 18;
        EstudiantePresencial epPresencial = new EstudiantePresencial(nombre, 
                apellido, identificacion, edad);
        epPresencial.establecerCostoCredito(18);
        epPresencial.establecerNumeroCreditos(20);
        epPresencial.calcularMatriculaPresencial();
        System.out.println(epPresencial);
    }
}
