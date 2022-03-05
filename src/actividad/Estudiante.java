package actividad;


public class Estudiante {
    private String nombre;
    private int[] calificaciones;
    private int promedio;
    private String calificacionFinal;

    public Estudiante() {
        this.initCalificaciones();
    }

    public void initCalificaciones() {
        this.calificaciones = new int[5];
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCalificaciones(int index, String calificacion) {
        try {
            int valor = Integer.parseInt(calificacion);
            this.calificaciones[index] = valor;
        }
        catch(NumberFormatException ex) {
            ex.printStackTrace();
        }
    }

    public void calcularPromedio() {
        this.promedio = (calificaciones[0] +calificaciones[1] +calificaciones[2] +calificaciones[3] +calificaciones[4]) / 5;
    }

    public void calcularCalificacionFinal() {
        if (this.promedio <= 50)
        {
            this.calificacionFinal = "F";
        }
        else if (this.promedio > 50 && this.promedio <= 60)
        {
            this.calificacionFinal = "E";
        }
        else if (this.promedio > 60 && this.promedio <= 70)
        {
            this.calificacionFinal = "D";
        }
        else if (this.promedio > 70 && this.promedio <= 80)
        {
            this.calificacionFinal = "C";
        }
        else if (this.promedio > 80 && this.promedio <= 90)
        {
            this.calificacionFinal = "B";
        }
        else
        {
            this.calificacionFinal = "A";
        }
    }

    public void imprimeResultados() {
        System.out.print("Nombre del estudiante: ");
        System.out.print(this.nombre);
        System.out.println();

        for (int index = 0; index < this.calificaciones.length; index++){
            int numero = index + 1;
            System.out.print("Calificacion " + numero + ":" + this.calificaciones[index]);
            System.out.println();
        }

        System.out.print("Promedio: ");
        System.out.print(this.promedio);
        System.out.println();
        System.out.print("Calificacion: ");
        System.out.print(calificacionFinal);
    }
}
