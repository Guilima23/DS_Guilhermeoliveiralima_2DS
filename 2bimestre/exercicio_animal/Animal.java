/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_animal;

/**
 *
 * @author Guilherme Lima 2Db
 */
public class Animal {
    private String nome;
    private float comprimento;
    private int num_patas;
    private String cor;
    private String ambiente;
   private float velocidademedia;
   //Construtor
   public Animal(String nome,float comprimento,int num_patas, String cor,String ambiente,float velocidademedia){
      this.nome=nome;
      this.comprimento=comprimento;
       this.num_patas=num_patas;
       this.cor=cor;
       this.ambiente=ambiente;
       this.velocidademedia=velocidademedia;
       
   }
 public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public float getComprimento() { return comprimento; }
    public void setComprimento(float comprimento) { this.comprimento = comprimento; }

    public int getNumeroDePatas() { return num_patas; }
    public void setNumeroDePatas(int numeroDePatas) { this.num_patas = num_patas; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public String getAmbiente() { return ambiente; }
    public void setAmbiente(String ambiente) { this.ambiente = ambiente; }

    public float getVelocidadeMedia() { return velocidademedia; }
    public void setVelocidadeMedia(float velocidadeMedia) { this.velocidademedia = velocidademedia; }

    // Método dados (Relatório)
    public void dados() {
        System.out.println("----------- Relatório do Animal -----------");
        System.out.println("Nome: " + nome);
        System.out.println("Comprimento: " + comprimento + " cm");
        System.out.println("Número de patas: " + num_patas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade média: " + velocidademedia + " m/s");
        System.out.println("-------------------------------------------");
    }
}
