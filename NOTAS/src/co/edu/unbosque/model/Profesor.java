package co.edu.unbosque.model;

public class Profesor extends Persona {
    private int horasClase;

    public Profesor(String nombre, String cedula, String email, String telefono, int horasClase) {
        super(nombre, cedula, email, telefono);
        this.horasClase = horasClase;
    }

    public int getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(int horasClase) {
        this.horasClase = horasClase;
    }

    @Override
    public void mostrarInformacion() {
        // Implementar lógica para mostrar información del profesor
    }
}
