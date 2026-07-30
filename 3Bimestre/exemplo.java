/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Aluno CA
 */
public abstract class Veículo {
   


    private String marca;
    private String modelo;

    public Veículo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método abstrato
    public abstract double calcularConsumo();

    // Método concreto
    public void informacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Consumo: " + calcularConsumo());
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
