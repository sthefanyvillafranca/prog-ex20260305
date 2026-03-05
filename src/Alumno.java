/**
 * @author sthefany villafranca
 */
public class Alumno {
    private int id;
    private String nombre;
    private String tituloFP;
    private int edad;

    /**
     * Metodo constructor:
     * @param id
     * @param nombre
     * @param tituloFP
     * @param edad
     */
    public Alumno(int id, String nombre, String tituloFP, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.tituloFP = tituloFP;
        this.edad = edad;
    }

    /**
     * Getter
     * @return int
     */
    public int getId() {
        return id;
    }

    /**
     * getNombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * TituloFP
     * @return String
     */
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
