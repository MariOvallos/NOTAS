package co.edu.unbosque.model;

import java.util.ArrayList;

public class Estudiante extends Persona {
    private String carrera;
    private String sexo;
    private ArrayList<Double> notas;

    public Estudiante(String nombre, String cedula, String email, String telefono, String carrera, String sexo) {
        super(nombre, cedula, email, telefono);
        this.carrera = carrera;
        this.sexo = sexo;
        this.notas = new ArrayList<>();
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void agregarNota(double nota) {
        notas.add(nota);
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public double obtenerPromedio() {
        return notas.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }

    public double obtenerNotaMasAlta() {
        return notas.stream().mapToDouble(Double::doubleValue).max().orElse(0);
    }

    public double obtenerNotaMasBaja() {
        return notas.stream().mapToDouble(Double::doubleValue).min().orElse(0);
    }

    public boolean estaAprobado() {
        return obtenerPromedio() >= 3.0; // Asumiendo 3.0 como nota mínima de aprobación
    }

    @Override
    public void mostrarInformacion() {
        // Implementar lógica para mostrar información del estudiante
    }
}
