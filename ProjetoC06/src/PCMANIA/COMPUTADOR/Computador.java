package PCMANIA.COMPUTADOR;
public class Computador {
    //Chamando outras classe para utilizar elas depois
    public HardwareBasico[] hardwareBasicos = new HardwareBasico[5];
    public MemoriaUsb mUsb;
    public SistemaOperacional SistOp;
    //Declaracao de variaveis
    int QuantidadeUSB = 0; //Variavel para verificacao de quantos USBs serao requisitados
    private String marca;
    private float preco;

    //Construtor para ler os dados sem precisar de getter ou setter
    //Exemplo: (Computador pc = new Computador("Dell", 3500);)
    public Computador(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;
    }

    //Criando o getter para poder ler o preco do computador em outra classe
    public float getPreco() {
        return preco;
    }
    public void addMemoriaUSB(MemoriaUsb musb) {
        this.mUsb = musb;
    }
    //Mostrando as configuracoes do computador
    public void mostraPCConfigs() {
        System.out.println("-Marca: " + marca);
        System.out.println("-Preço: " + preco);
        // Sistema Operacional
        //Verifica se existe um sistema operacional, se sim, mostra o nome dele(UML)
        if (SistOp!=null) {
        System.out.println("-SO: " + SistOp.getNome());}
        // Hardware
        System.out.println("Hardwares:");
        //Percorre todos os hardwares
        for (int i = 0; i < hardwareBasicos.length; i++) {
            //Verficando cada posicao, se existir um naquela posicao verificada, mostra o nome
            if (hardwareBasicos[i] != null) {
                System.out.println("- " + hardwareBasicos[i].getNome() +
                        " (" + hardwareBasicos[i].getCapacidade() + ")");
            }
        }
        // USBs
        System.out.println("Memória USB:");
        //Verificando se existe USB (UML)
        if (mUsb != null) {
            System.out.println("- " + mUsb.getNome() +
                    " (" + mUsb.getCapacidade() + "GB)");
        }
    }
}





