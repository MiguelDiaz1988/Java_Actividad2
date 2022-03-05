package actividad;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        var estudiante = new Estudiante();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingresa nombre del estudiante:");
            String nombre = reader.readLine();
            estudiante.setNombre(nombre);

            System.out.print("Ingresa primera calificacion:");
            String c1 = reader.readLine();
            estudiante.setCalificaciones(0, c1);

            System.out.print("Ingresa segunda calificacion::");
            String c2 = reader.readLine();
            estudiante.setCalificaciones(1, c2);

            System.out.print("Ingresa tercera calificacion:");
            String c3 = reader.readLine();
            estudiante.setCalificaciones(2, c3);

            System.out.print("Ingresa cuarta calificacion:");
            String c4 = reader.readLine();
            estudiante.setCalificaciones(3, c4);

            System.out.print("Ingresa quinta calificacion:");
            String c5 = reader.readLine();
            estudiante.setCalificaciones(4, c5);

            estudiante.calcularPromedio();
            estudiante.calcularCalificacionFinal();
            estudiante.imprimeResultados();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
