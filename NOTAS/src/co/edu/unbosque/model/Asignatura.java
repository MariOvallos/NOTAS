package co.edu.unbosque.model;

import java.util.ArrayList;

public class Asignatura {
    private String id;
    private String nombre;
    private int intensidadHoraria;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes;

    public Asignatura(String id, String nombre, int intensidadHoraria) {
        this.id = id;
        this.nombre = nombre;
        this.intensidadHoraria = intensidadHoraria;
        this.estudiantes = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIntensidadHoraria() {
        return intensidadHoraria;
    }

    public void setIntensidadHoraria(int intensidadHoraria) {
        this.intensidadHoraria = intensidadHoraria;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void mostrarInformacion() {
        // Implementar lógica para mostrar información de la asignatura
    }
}
