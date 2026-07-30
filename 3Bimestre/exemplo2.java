/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Aluno CA
 */
public class Carro extends Veículo{
  private double cilindrada;

    public Carro(String marca, String modelo, double cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularConsumo() {
        return 15.0 - (cilindrada / 200);
    }

    public double getCilindrada() {
        return cilindrada;
    }
}
