public class Main {
    public static void main(String[] args) {
        Alumno alumno1;
        Alumno alumno2;
        Alumno alumno3;
        CentroFP centroFP;

        centroFP = new CentroFP(20);

        alumno1 = new Alumno(1,"Rodrigo","DAM",26);
        alumno2 = new Alumno(2,"Panfi","DAM",20);
        alumno3 = new Alumno(3,"Harry","DAM",21);

        centroFP.registrarAlumno(alumno1);
        centroFP.registrarAlumno(alumno2);
        centroFP.registrarAlumno(alumno3);

        System.out.println(centroFP.mostrarAlumnos());
        System.out.println("============*============");
        System.out.println("Número de alumnos encontrados:");
        System.out.println(centroFP.contarAlumnos());

        System.out.println("\n==============");
        System.out.println("Buscar un alumno inexistente:");
        System.out.println(centroFP.buscarAlumno(4));

        System.out.println("\n==============");
        System.out.println("Buscar un alumno existente:");
        System.out.println(centroFP.buscarAlumno(1));
        
    }
}
