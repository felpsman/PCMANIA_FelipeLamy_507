package PCMANIA.COMPUTADOR;

public class MemoriaUsb {
    private String nome;
    private int capacidade;
    //Construtor da funcao para incializacao do objeto
    public MemoriaUsb(String nome, int capacidade){
        //Varaiveis com this para receber os nomes e poder mexer em variaveis private
        this.nome=nome;
        this.capacidade=capacidade;
    }
    //Permitindo acessar os valores dos atributos controlados (Por conta de serem private)
    public String getNome() {
        return nome;
    }
    public int getCapacidade() {
        return capacidade;
    }
}
