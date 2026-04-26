package java;

import java.util.Date;

public class Usuario {

    private int id;
    private String nombre;
    private String apellido1;
    private String apellido;
    private String email;
    private Date fechaNacimiento;

    public Usuario(int id, String nombre, String apellido1, String apellido, String email, Date fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido = apellido;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String toString() {
        return id + " - " + nombre + " " + apellido1 + " (" + email + ")";
    }
}