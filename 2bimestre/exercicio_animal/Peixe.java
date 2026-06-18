package exercicio_animal;

public class Peixe extends Animal {

    private String caracteristica;

    // Construtor
    public Peixe(String nome, float comprimento, int num_patas,
                  String cor, String ambiente,
                  float velocidadeMedia, String caracteristica) {

        super(nome, comprimento, num_patas, cor, ambiente, velocidadeMedia);

        this.caracteristica = caracteristica;
    }

    // Getter
    public String getCaracteristica() {
        return caracteristica;
    }

    // Setter
    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    // Método para mostrar dados
    public void dadosPeixe() {

        dados();

        System.out.println("Característica: " + caracteristica);
        System.out.println("---------------------------");
    }
}


