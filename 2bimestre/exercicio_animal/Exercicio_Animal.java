
package exercicio_animal;

/**
 *
 * @author Guilherme Lima 2Db
 */
public class Exercicio_Animal {

    public static void main(String[] args) {

        // Camelo
        mamifero camelo = new mamifero(
                "Camelo",
                150,
                4,
                "Amarelo",
                "Terra",
                2.0f,
                "Vegetais"
        );

        // Tubarão
        Peixe tubarao = new Peixe(
                "Tubarao",
                300,
                0,
                "Cinzento",
                "Mar",
                1.6f,
                "Barbatanas e cauda"
        );

        // Urso do Canadá
        mamifero ursocanada = new mamifero(
                "Urso-do-canada",
                180,
                4,
                "Vermelho",
                "Terra",
                0.5f,
                "Mel"
        );

        // Imprimir dados
        camelo.dadosMamifero();

        tubarao.dadosPeixe();

        ursocanada.dadosMamifero();
    }
}

