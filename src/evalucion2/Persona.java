package evalucion2;

class Persona {
    protected int id;
    protected  String nombre;
    protected  String apellido;
    protected  int edad;
    protected  String genero;
    protected  String direccion;
    protected  String telefono;
    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, int edad, String genero, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    public void marcarAsistencia(){
        System.out.println("Llegue a la escuela");
    }


    public int getId(){return id;}

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public void mostrarInfomacion(){
        System.out.println("-----DATOS DEL PROFESOR-----");
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("edad: " + edad);
        System.out.println("genero: " + genero);
        System.out.println("direccion: "+ direccion);
        System.out.println("telefono: "+ telefono);
    }
}


