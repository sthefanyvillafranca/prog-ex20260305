package PACKAGE_NAME;

public class Alumno {
    private int id;
    private String nombre;
    private String tituloFP;
    private int edad;

    public Alumno(int id, String nombre, String tituloFP, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.tituloFP = tituloFP;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTituloFP() {
        return tituloFP;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return String.format("Alumno [id: %d | nombre: %s | tituloFP: %s | edad: %d]", id, nombre, tituloFP, edad);
    }
}
