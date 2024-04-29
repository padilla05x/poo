package co.edu.uniquindio.poo;

public class Persona {
    public final String nombres;
    public final String apellidos;
    public final String dni;
    public final String direccion;
    public final String telefono;

    public Persona(String nombres, String apellidos, String dni, String direccion, String telefono) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
}
