package PCMANIA.Cliente;

import PCMANIA.COMPUTADOR.Computador;

public class Cliente {
    //Atributos do Cliente
    private String nome;
    private String CPF;
    private float matricula;
    //Chamada da classe computador
    Computador[] Computadores = new Computador[10];
    int QuantidadeDeComputadores = 0;
    //Metodos da classe do cliente
    //Uma pequena alteracao em relacao ao UML. Quis adicionar matricula para registrar a matricula e poder indexar as compras de 3 formas diferentes
    public Cliente(String nome,String CPF,float matricula){
        this.nome=nome;
        this.CPF=CPF;
        this.matricula=matricula;
    }
    //Metodo para adicionar computador comprado no vetor
    public void addComputador(Computador pc) {
        //Verificando se ha espaco no tamanho do vetor, se sim, a varivel do pc recebe aquele computador comprado
        if (QuantidadeDeComputadores < Computadores.length) {
            Computadores[QuantidadeDeComputadores] = pc;
            //Contador anda para pegar o proximo espaco
            QuantidadeDeComputadores++;
        }
    }
    //Calculando o total da compra(Preco do computador selecionado)
    public float calculaTotalCompra() {
        //Iniciando com o total da compra em 0
        float total = 0;
        //Percorre os computadores comprados e traz o preco dele e soma a variavel total
        for (int i = 0; i < QuantidadeDeComputadores; i++)
            total += Computadores[i].getPreco();
        //Temos o retorno da variavel total apos a soma dos computadores selecionados
        return total;
    }
    //Metodo criado para mostrar a configuracao do computador comprado
    public void mostrarComputadoresComprados() {
        //Percorre o vetor tod do computador
        for (int i = 0; i < QuantidadeDeComputadores; i++) {
            //Se o a posicao do vetor nao estiver vazia, mostra a configuracao daquela posicao e assim por diante.
            if (Computadores[i] != null) {
                Computadores[i].mostraPCConfigs();
                System.out.println("----------------------");
            }
        }
    }
}
