package evalucion2;

public class Administrador {
}

class administrador extends Persona {
    protected String departamento;
    protected int aniosExperiencia;

    public administrador() {
    }
    public administrador(int id, String nombre, String apellido, int edad,
                         String genero, String direccion, String telefono, String departamento,
                         int aniosExperiencia) {
        super(id, nombre, apellido, edad, genero, direccion, telefono);
        this.departamento = departamento;
        this.aniosExperiencia = aniosExperiencia;
    }
    @Override
    public  void mostrarInfomacion(){
        super.mostrarInfomacion();
        System.out.println("Departamento: " + departamento);
        System.out.println("Años de Experiencia " + aniosExperiencia);

    }
    @Override
    public  void marcarAsistencia(){System.out.println("Estoy gestionando personal");
    }

    public void gestionPersonal(){System.out.println("Estoy gestionando personal");
    }
    public void planifivcarEventos(){System.out.println(" Estoy planificando algo");}
    public void marcarAsistenciA(){System.out.println("Estoy marcando algo");}
}

