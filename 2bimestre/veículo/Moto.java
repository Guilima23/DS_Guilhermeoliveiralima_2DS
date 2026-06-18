/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Aluno CA
 */
public class Moto extends Veículo{
 private int cilindradas;

    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularConsumo() {
        return 30.0 - (cilindradas / 100.0);
    }

    public int getCilindradas() {
        return cilindradas;
    }}
