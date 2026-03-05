package PACKAGE_NAME;

public class CentroFP {
    private Alumno[] alumnos;
    private final int MAX_ALUMNOS;

    /**
     * Metodo constructor
     * @param MAX_ALUMNOS
     */
    public CentroFP(int MAX_ALUMNOS) {
        this.MAX_ALUMNOS = 20;
        alumnos = new Alumno[MAX_ALUMNOS];
    }

    /**
     * Metodo que Busca la primera posición libre dentro del array.
     * @return int el índice libre si lo encuentra o -1 si el array está completo
     */
    private int buscarPrimerHuecoLibre() {
        int posicionHuecoLibre = -1;
        boolean sigueBuscando = true;

        for(int i = 0; i < MAX_ALUMNOS && sigueBuscando; i++){
            if(alumnos[i] == null){
                posicionHuecoLibre = i;
                sigueBuscando = false;
            }
        }
        return posicionHuecoLibre;
    }

    /**
     *Metodo que busca un alumno con el identificador recibido
     * @param id
     * @return el objeto Alumno si lo encuentra o null si no existe
     */
    public Alumno buscarAlumno(int id) {
        boolean sigueBuscando = true;
        Alumno alumnoEncontrado = null;

        for (int i = 0; i < MAX_ALUMNOS && sigueBuscando; i++) {
            if (alumnos[i] != null) {
                if (alumnos[i].getId() == id) {
                    alumnoEncontrado = alumnos[i];
                    sigueBuscando = false;
                }
            }
        }
        return alumnoEncontrado;
    }

    /**
     * Metodo que Añade un alumno al sistema
     * @param alumno
     * @return true si el alumno se ha registrado correctamente o false si no se ha podido
     */
    public boolean registrarAlumno(Alumno alumno) {
        boolean registroRealizado = false;
        int posicionHuecoLibre;

        posicionHuecoLibre = buscarPrimerHuecoLibre();

        if (buscarAlumno(alumno.getId()) == null) { // SI ES IGUAL A NULL ES PORQUE NO EXISTE ANTES
            if (posicionHuecoLibre >= 0) {
                alumnos[posicionHuecoLibre] = alumno;
                registroRealizado = true;
            }
        }
        return registroRealizado;
    }

    /**
     * Metodo que muestra por pantalla todos los alumnos almacenados
     * @return String
     */
    public String mostrarAlumnos() {
        StringBuilder sb = new StringBuilder("Lista de alumnos : \n");
        for (int i = 0; i < MAX_ALUMNOS; i++) {
            if (alumnos[i] != null) {
                sb.append(alumnos[i].toString());
                sb.append("\n");
            }
        }
        return sb.toString(); /* No devuelve un string ??? */
    }

    /**
     *Metodo que cuenta los alumnos existentes 
     * @return int (regresa el numero de alumnos)
     */
    public int contarAlumnos() {
        int contador = 0;
        for (int i = 0; i < MAX_ALUMNOS; i++) {
            if (alumnos[i] != null) {
                contador++;
            }
        }
        return contador;
    }
}

/**
 * public Alumno buscarAlumno(int id)
 * private int buscarPrimerHuecoLibre()
 * public boolean registrarAlumno(Alumno alumno)
 * todo: public void mostrarAlumnos()
 * todo: public int contarAlumnos()
 */