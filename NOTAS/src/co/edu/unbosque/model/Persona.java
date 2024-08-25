package co.edu.unbosque.model;

public abstract class Persona {
    protected String nombre;
    protected String cedula;
    protected String email;
    protected String telefono;

    public Persona(String nombre, String cedula, String email, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public abstract void mostrarInformacion();
}
