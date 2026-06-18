/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Aluno CA
 */
public class Caminhão extends Veículo{
    private double carga;

    public Caminhão(String marca, String modelo, double carga) {
        super(marca, modelo);
        this.carga = carga;
    }

    @Override
    public double calcularConsumo() {
        return 5.0 - (carga / 1000.0);
    }

    public double getCarga() {
        return carga;
    }
}