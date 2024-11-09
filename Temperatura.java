/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectotemperatura;

/**
 *
 * @author Graciela
 */
class Temperatura {
    // Atributo privado, no accesible desde fuera de la clase
    private double celsius;
    public Temperatura(double celsius) {
        this.celsius = celsius;
    }
    // Método para obtener la temperatura en Celsius
    public double getCelsius() {
        return celsius;
    }
    // Método para obtener la temperatura en Fahrenheit
    public double getFahrenheit() {
        return celsius * 9 / 5 + 32;
    }
    // Método para establecer la temperatura en Celsius
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
    // Método para establecer la temperatura en Fahrenheit, realiza la conversión internamente
    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }
}

