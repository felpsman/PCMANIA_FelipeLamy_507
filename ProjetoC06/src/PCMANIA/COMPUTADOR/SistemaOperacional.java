package PCMANIA.COMPUTADOR;

public class SistemaOperacional {
    private String nome;
    private int Tipo;
    public SistemaOperacional(String nome, int Tipo){
        this.nome=nome;
        this.Tipo=Tipo;
    }
    public String getNome() {
        return nome;
    }
    public int getTipo() {
        return Tipo;
    }
}
