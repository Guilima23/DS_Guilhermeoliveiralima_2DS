/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package saque;

/**
 *
 * @author CAMARGO
 */
public class SaldoInsuficienteException  extends Exception{
   public SaldoInsuficienteException(double saldoDisponivel, double valorSolicitado) {
        super(String.format(
            "Saldo insuficiente. Saldo disponível: R$ %.2f. Valor solicitado: R$ %.2f.",
            saldoDisponivel,
            valorSolicitado
        ));
    }
}
