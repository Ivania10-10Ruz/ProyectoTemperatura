/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectotemperatura;

/**
 *
 * @author Graciela
 */
public class ProyectoTemperatura {

   public static void main(String[] args) {
        Temperatura temp = new Temperatura(25.0);

       
        System.out.println("Temperatura en Celsius: " + temp.getCelsius());
        System.out.println("Temperatura en Fahrenheit: " + temp.getFahrenheit());

        
        temp.setFahrenheit(98.6);
        System.out.println("Temperatura ajustada en Celsius: " + temp.getCelsius());
        System.out.println("Temperatura ajustada en Fahrenheit: " + temp.getFahrenheit());
    }
}
