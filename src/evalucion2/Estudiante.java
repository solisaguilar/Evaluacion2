package evalucion2;


class Estudiante extends Persona{

    protected String grado;

    public Estudiante() {
    }

    public Estudiante(int id, String nombre, String apellido, int edad, String genero, String direccion, String telefono, String grado) {
        super(id, nombre, apellido, edad, genero, direccion, telefono);
        this.grado = grado;
    }
    @Override
    public  void mostrarInfomacion(){
        super.mostrarInfomacion();

    }
    @Override
    public  void marcarAsistencia(){System.out.println("Estoy marcando asistencia como Estudiante");}
    public void presentarTarea(){System.out.println("El alumno da la tarea");}
    public void tomarClase(){System.out.println("El alumono enseña la clase");}
    public void hacerExamen(){System.out.println("El alumno hace un examen");}

}

