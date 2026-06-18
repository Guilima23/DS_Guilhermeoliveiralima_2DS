package exercicio_animal;

// Classe Mamifero
public class mamifero extends Animal {

    private String alimento;

    // Construtor
    public mamifero(String nome, float comprimento, int num_patas,
                    String cor, String ambiente, float velocidadeMedia,
                    String alimento) {

        super(nome, comprimento, num_patas, cor, ambiente, velocidadeMedia);

        this.alimento = alimento;
    }

    // Getter
    public String getAlimento() {
        return alimento;
    }

    // Setter
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    // Método para mostrar dados
    public void dadosMamifero() {

        dados();

        System.out.println("Alimento: " + alimento);
        System.out.println("---------------------------");
    }
}

