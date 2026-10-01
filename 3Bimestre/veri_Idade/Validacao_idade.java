
package validacao_idade;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author CAMARGO
 */
public class Validacao_idade {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();

            if (idade > 120) {
                throw new IdadeInvalidaException("Idade inválida!");
            }

            System.out.println("Idade válida!");

        } catch (IdadeInvalidaException e) {
            System.out.println("Idade inválida!");

        } catch (java.util.InputMismatchException e) {
            System.out.println("Digite apenas um número inteiro.");

        }           
    }
}
    
    
