# PCMANIA_FelipeLamy_507
Nome:Felipe Lamy Rosa Renno
C06-A
Matricula:507
---
Projeto realizado em cima da proposta do professor para um melhor entendimento da estrutura de objeto e POO.
Realizei o projeto utilizando meus conhecimentos sobre java e consultando livros, slides da aula, codigos das aulas, videos e chatGPT versao 5.3.
---
Uso do ChatGPT:
  Utilizei o ChatGPT para me ajudar a corrigir alguns erros do meu codigo, perguntas sobre o que servia tal funcao que iria utilizar, para uma pequena ajuda a interpretar o UML, e para descrever o projeto no Readme.
---
  Exemplo de perguntas para o ChatGPT:
    O construtor deve ter o mesmo nome da classe ?
---
Resultado:
Sim — obrigatoriamente.
🧠 Regra
O construtor deve ter exatamente o mesmo nome da classe.
✅ Exemplo correto
class Computador {
   public Computador(String marca, float preco) {
       // construtor
      }
   }
 ---
Quando usar setter e getter e quando nao usar ?
  Resultado:
---
✅ Quando USAR getter e setter
 1. 🔒 Proteger atributos (encapsulamento)
 2. Se o atributo é private, você usa getters/setters pra acessar de fora.
     private double saldo;
    public double getSaldo() {
    return saldo;
    }
     public void setSaldo(double saldo) {
     this.saldo = saldo;
    }---
        2. ⚠️ Quando precisa VALIDAR dados
        Setter é útil quando você quer evitar valores inválidos:
        public void setSaldo(double saldo) {
            if (saldo >= 0) {
                this.saldo = saldo;
              }
          }
          ---
        👉 Aqui faz total sentido usar setter.
        3. 📖 Getter para leitura controlada
        Quando você quer permitir leitura, mas não alteração:
          public double getSaldo() {
              return saldo;
            }
        (Sem setter)
        ❌ Quando NÃO usar setter/getter
        1. 🚫 Quando quebra a lógica da classe
        Exemplo clássico:
      Cliente cliente = new Cliente(...);
      cliente.setCpf("outroCpf"); // ❌ perigoso
      ---
      👉 CPF não deveria mudar → não crie setter
      2. 🚫 Quando o atributo não deve ser exposto
      Exemplo:
      ---
      private double senha;
      👉 Não faz sentido:
      getSenha() ❌
      ---
      3. 🚫 Quando a ação deve ser feita por MÉTODO, não setter
      Errado:
      conta.setSaldo(conta.getSaldo() + 100);
      Certo:
      conta.depositar(100);
      👉 Setter não substitui comportamento.
      🧠 Regra de ouro (guarda isso)
      Getter → quase sempre ok
      Setter → só quando faz sentido alterar
      Se tem regra → use método (ex: depositar, comprar)
      💥 Aplicando no seu UML
      Cliente
      nome → pode ter getter
      cpf → ❌ NÃO deve ter setter
      Computador
      preco → pode ter getter
      Setter só se fizer sentido alterar depois
      ---
      🔥 Resumo simples
      ✔️ Use getter → leitura
      ✔️ Use setter → com controle/validação
      ❌ Não use setter pra tudo automaticamente
      ❌ Não exponha dados sensíveis ou imutáveis
---
No geral, acredito que o uso do ChatGPT no projeto tenha sido bem benefico para minha aprendizagem sobre o funcionamento de java. 
---
Tambem utilizei o livro "Caelum - Java e Orientação a Objetos" em versao Pdf para aprofundar e entender alguns conceitos de programcao orientada a objetos.
---
Para entender melhor o UML, assisti um video do youtube:  https://www.youtube.com/watch?v=OuO49oIzV10
---
Para comecar a escrever o codigo e ir avancando no projeto, utilizei os slides das Aulas e tambem o repositorio dos codigos das aulas.
---
Abaixo, temos a explicacao do projeto que pedi para chat fazer: Utilizei o prompt: "Faca um resumo do que voce me ajudou para eu adicionar no readme do projeto"
---
# 🖥️ Projeto PCMANIA — Resumo do Desenvolvimento
  ## 📌 Objetivo
Desenvolver um sistema em Java para simular a compra de computadores, permitindo cadastrar clientes, selecionar ofertas e visualizar o resumo do pedido.
---
  ## 🧱 Estrutura do Projeto
O sistema foi dividido em classes principais:
* **Computador** → representa um PC com marca, preço, hardware, sistema operacional e USB
* **Cliente** → armazena os dados do cliente e os computadores comprados
* **Loja** → responsável por criar ofertas de computadores
* **ProcessarPedido** → exibe o resumo final da compra
---
  ## ⚙️ Principais Implementações
### ✔ Classe `Computador`
* Uso de **construtor** para inicializar marca e preço
* Vetor de `HardwareBasico` para armazenar componentes
* Associação com:
  * `SistemaOperacional`
  * `MemoriaUsb`
* Método `mostraPCConfigs()` para exibir as configurações
* Correção importante:
  * Verificação de `null` no Sistema Operacional e USB para evitar erro
---
  ### ✔ Classe `Cliente`
* Armazena:
  * Nome, CPF e matrícula
  * Vetor de computadores comprados
* Método `addComputador()`:
  * Adiciona computadores ao vetor
  * Incrementa corretamente o contador
* Método `calculaTotalCompra()`:
  * Soma o preço de todos os computadores
* Método `mostrarComputadoresComprados()`:
  * Percorre e exibe apenas os computadores adquiridos
---
### ✔ Classe `Loja`
* Métodos estáticos (`oferta1`, `oferta2`, etc.) para criar computadores prontos
* Uso da matrícula para compor o preço dos produtos
---
### ✔ Classe `ProcessarPedido`
* Responsável apenas por exibir o resumo final
* Correção importante:
  * Remoção de vetor próprio de computadores (evita duplicação de dados)
  * Uso direto dos dados do `Cliente`
---
## 🔥 Principais Aprendizados
* Diferença entre:
  * **Construtor** → inicializa objetos
  * **Getter/Setter** → acessa e modifica atributos
* Uso correto de **vetores de objetos**
* Importância de controlar índices (ex: quantidade de elementos)
* Verificação de `null` para evitar erros em tempo de execução
---
  ## ⚠️ Erros Corrigidos
* Uso incorreto de loop para um único objeto (`MemoriaUsb`)
* Falta de incremento no contador de computadores
* Tentativa de acessar objetos `null`
* Duplicação de dados entre classes
* Métodos sem retorno ou com chamada incorreta
---
  ## ▶️ Fluxo do Sistema
1. Cliente é criado
2. Usuário escolhe um computador (oferta da loja)
3. Computador é adicionado ao cliente
4. Pedido é processado
5. Sistema exibe:
   * Configuração dos PCs comprados
   * Valor total da compra
---
