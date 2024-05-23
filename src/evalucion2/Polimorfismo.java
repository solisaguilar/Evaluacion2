package evalucion2;

import java.util.Scanner;

public class Polimorfismo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        profesor Profesor = new profesor();
        System.out.println("Ingrese su Id profesor");
        Profesor.id = entrada.nextInt();
        System.out.println("Ingrese su Nombre:");
        Profesor.nombre = entrada.next();
        System.out.println("Ingrese su Apellido:");
        Profesor.apellido = entrada.next();
        System.out.println("Ingrese su Edad:");
        Profesor.edad = entrada.nextInt();
        System.out.println("Ingrese genero:");
        Profesor.genero = entrada.next();
        System.out.println("Ingrese direccion:");
        Profesor.direccion = entrada.next();
        System.out.println("Ingrese su telefono:");
        Profesor.telefono = entrada.next();
        System.out.println("Ingrese su materia:");
        Profesor.materia = entrada.next();
        System.out.println("Ingrese su nit:");
        Profesor.nit = entrada.nextInt();
        System.out.println("Ingrese su especialidad:");
        Profesor.especialidad = entrada.next();
        System.out.println("Ingrese sus años de experiencia:");
        Profesor.experiencia = entrada.nextInt();
        Profesor.mostrarInfomacion();
        System.out.println("\n");

        Estudiante Estudiante = new Estudiante();
        System.out.println("Ingrese su Id Estudiante");
        Estudiante.id = entrada.nextInt();
        System.out.println("Ingrese su Nombre:");
        Estudiante.nombre = entrada.next();
        System.out.println("Ingrese su Apellido:");
        Estudiante.apellido = entrada.next();
        System.out.println("Ingrese su Edad:");
        Estudiante.edad = entrada.nextInt();
        System.out.println("Ingrese genero:");
        Estudiante.genero = entrada.next();
        System.out.println("Ingrese direccion:");
        Estudiante.direccion = entrada.next();
        System.out.println("Ingrese su telefono:");
        Estudiante.telefono = entrada.next();
        System.out.println("Ingrese su grado:");
        Estudiante.grado = entrada.next();
        Estudiante.mostrarInfomacion();
        System.out.println("\n");

        administrador admin = new administrador();
        System.out.println("Ingrese su Id Administrador");
        admin.id = entrada.nextInt();
        System.out.println("Ingrese su Nombre:");
        admin.nombre = entrada.next();
        System.out.println("Ingrese su Apellido:");
        admin.apellido = entrada.next();
        System.out.println("Ingrese su Edad:");
        admin.edad = entrada.nextInt();
        System.out.println("Ingrese genero:");
        admin.genero = entrada.next();
        System.out.println("Ingrese direccion:");
        admin.direccion = entrada.next();
        System.out.println("Ingrese su telefono:");
        admin.telefono = entrada.next();
        System.out.println("Ingrese su departamento:");
        admin.departamento = entrada.next();
        System.out.println("Ingrese sus años de experiencia");
        admin.aniosExperiencia = entrada.nextInt();
        admin.mostrarInfomacion();
        System.out.println("\n");
    }
}
