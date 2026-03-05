package PACKAGE_NAME;

public class CentroFP {
    private Alumno[] alumnos;
    private final int MAX_ALUMNOS;

    public CentroFP(int MAX_ALUMNOS) {
        this.MAX_ALUMNOS = 20;
        alumnos = new Alumno[MAX_ALUMNOS];
    }

    private int buscarPrimerHuecoLibre(){
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

    public Alumno buscarAlumno(int id){
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

    public int contarAlumnos(){
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