package PCMANIA.COMPUTADOR;

public class HardwareBasico {
    private String nome;
    private float capacidade;
    //Realizando o construtor para iniciliazar um objeto
    public HardwareBasico(String nome, float capacidade){
        this.nome=nome;
        this.capacidade=capacidade;
    }
    //Permitindo acessar os valores dos atributos controlados (Por conta de serem private)
    public String getNome() {
        return nome;
    }
    public float getCapacidade() {
        return capacidade;
    }
}
