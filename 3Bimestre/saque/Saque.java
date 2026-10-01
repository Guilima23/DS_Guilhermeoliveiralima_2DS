/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package saque;

import java.util.Scanner;

/**
 *
 * @author CAMARGO
 */
public class Saque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
    ;            

        try {
            System.out.print("Saldo disponível: R$ ");
            double saldo = scanner.nextDouble();

            System.out.print("Valor do saque: R$ ");
            double saque = scanner.nextDouble();

            if (saque <= 0) {
                throw new IllegalArgumentException(
                    "O valor do saque deve ser maior que zero."
                );
            }

            if (saque > saldo) {
                throw new SaldoInsuficienteException(saldo, saque);
            }

            saldo -= saque;

            System.out.printf("Saque realizado com sucesso!%n");
            System.out.printf("Novo saldo: R$ %.2f%n", saldo);

        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());

        } finally {
            System.out.println("Operação finalizada.");
            scanner.close();
        }
    }
}
    
    

