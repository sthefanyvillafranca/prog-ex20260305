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

}
