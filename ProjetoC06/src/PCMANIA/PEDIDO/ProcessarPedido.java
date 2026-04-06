package PCMANIA.PEDIDO;
import PCMANIA.Cliente.Cliente;
//Classe criada para mostrar o processamento do pedido (Valor total, quais pcs foram comprados)
public class ProcessarPedido {
    public void processar(Cliente cliente) {
        System.out.println("\n=== RESUMO DO PEDIDO ===");
        System.out.println("Total da compra: R$ " + cliente.calculaTotalCompra());
        System.out.println("\n=== COMPUTADORES COMPRADOS ===");
        cliente.mostrarComputadoresComprados();
        System.out.println("Pedido processado com sucesso!");
    }
}

