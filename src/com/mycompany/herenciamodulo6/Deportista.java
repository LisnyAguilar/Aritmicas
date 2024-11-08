/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciamodulo6;

/**
 *
 * @author Usuario
 */
// Deportista.java
public class Deportista extends Persona {
    private String deporte;

    public Deportista(String nombre, int edad, String dni, String deporte) {
        super(nombre, edad, dni);
        this.deporte = deporte;
    }

    @Override
    public String mostrarInformacion() {
        return "Deportista: " + getNombre() + ", Edad: " + getEdad() + ", DNI: " + getDni() + ", Deporte: " + deporte;
    }
    
    // Nuevo método para la rutina de entrenamiento
    public String entrenamientoDiario() {
        return "La deportista " + getNombre() + " entrena 2 horas diarias de " + deporte + ".";
    }

    // Getters y Setters
    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
}

