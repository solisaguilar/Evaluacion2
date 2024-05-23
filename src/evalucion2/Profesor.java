package evalucion2;

public class Profesor {
}

class profesor extends Persona{
    protected String materia;
    protected int nit;
    protected String especialidad;
    protected int experiencia;

    public profesor() {
    }

    public profesor(int id, String nombre, String apellido, int edad, String genero, String direccion,
                    String telefono, String materia,
                    int nit, String especialidad, int experiencia) {
        super(id, nombre, apellido, edad, genero, direccion, telefono);
        this.materia = materia;
        this.nit = nit;
        this.especialidad = especialidad;
        this.experiencia = experiencia;
    }

    @Override
    public  void mostrarInfomacion(){
        super.mostrarInfomacion();
        System.out.println("Materia: " + materia);
        System.out.println("Nit: " + nit);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Años de experiencia: " + experiencia);
    }
    @Override
    public  void marcarAsistencia(){System.out.println("Estoy marcando asistencia como profesor");
    }

    public void prepararClse(){System.out.println("El profesor da clases");}
    public void enseñar(){System.out.println("El profesoor enseña la clase");}
    public void evaluarAlumno(){System.out.println("El profesor evalua a los Estudiantes");}

}
