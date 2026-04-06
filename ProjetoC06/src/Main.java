import PCMANIA.Cliente.Cliente;
import PCMANIA.COMPUTADOR.Computador;
import PCMANIA.Loja.Loja;
import PCMANIA.PEDIDO.ProcessarPedido;
import java.util.Scanner;
public class Main {
    static void main(String[] args) {
    //Lendo os dados do cliente e armazenando nas respectivas variaveis da classe cliente
        Scanner entrada = new Scanner(System.in);
        //Pedindo o nome para o usario
        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine();
        //Pedindo o cpf do usuario
        System.out.println("Digite seu CPF:");
        String CPF = entrada.nextLine();
        //Pedindo a matricula do usario
        System.out.println("Digite sua matricula:");
        float matricula = entrada.nextFloat();
        //Boas Vindas da loja
        System.out.println("Seja Bem-vindo"+nome +" Gostaria de ver as nossas promocoes?\n Digite 1 para sim e 0 para sair!");
        //Variavel para ver se o usario ira querer ver as ofertas e continuar comprando ou nao
        int sim = entrada.nextInt();
        //Varivel compra, para o cliente escolher qual ele ira comprar
        int compra;
        //Variavel quantidade de compra para saber quantas compra houve ou se nao houve nenhuma compra
        int quantidadeDecompra=0;
        //Armazenando os valores das variveis na classe Cliente para usar os metodos da classe
        Cliente cliente = new Cliente(nome, CPF, matricula);
        //Armazenando os dados dos computadores nas variaveis respectivas
        Computador pc1 = Loja.oferta1(matricula);
        Computador pc2 = Loja.oferta2(matricula);
        Computador pc3 = Loja.oferta3(matricula);
        while (sim==1){
            System.out.println("Oferta 1:");
            pc1.mostraPCConfigs();
            System.out.println("Oferta 2:");
            pc2.mostraPCConfigs();
            System.out.println("Oferta 3:");
            pc3.mostraPCConfigs();
            System.out.println(nome+" Deseja comprar alguma dessas ofertas?\n Codigo 1 para oferta 1\n Codigo 2 para oferta 2\n Codigo 3 para oferta 3");
            compra= entrada.nextInt();
            if (compra==1) {
                cliente.addComputador(pc1);
                quantidadeDecompra++;
            }
            else if (compra == 2){
                cliente.addComputador(pc2);
                quantidadeDecompra++;
            }
            else if(compra==3){
                cliente.addComputador(pc3);
                quantidadeDecompra++;
            }
            //Verificando se o cliente quer continuar vendo as promocoes ou deseja sair
            System.out.println(nome +" Gostaria de continuar vendo as nossas promocoes?\n Digite 1 para sim e 0 para sair!");
            sim = entrada.nextInt();
        }
        ProcessarPedido pedido = new ProcessarPedido(); //Criando um obejeto para mostrar o processamento do pedido
        if (sim==0 && quantidadeDecompra==0)
        {
            System.out.println("Obrigado pela visita, volte sempre!");
        }
        if (quantidadeDecompra!=0){
            System.out.println("Muito Obrigado por comprar com a gente, para qualquer duvida, estaremos a disposicao. Volte Sempre!");
            pedido.processar(cliente);
        }
    }
}