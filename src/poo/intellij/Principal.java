package poo.intellij;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    List<Cliente> clientes = new ArrayList<>();
    List<Pedido> pedidos = new ArrayList<>();
    List<LivroComum> livrosComuns = new ArrayList<>();
    List<LivroTecnico> livrosTecnicos = new ArrayList<>();

    private void exibirMenu(){
        System.out.println("\n");
        System.out.println("*******************************************");
        System.out.println("||      >>>   Menu de Opções   <<<       ||");
        System.out.println("*******************************************");
        System.out.println("||            01 - Clientes              ||");
        System.out.println("||            02 - Livros                ||");
        System.out.println("||            03 - Pedidos               ||");
        System.out.println("||                                       ||");
        System.out.println("||            99 - Sair                  ||");
        System.out.println("*******************************************");
    }

    private void exibirClientes(){
        System.out.println("\n");
        System.out.println("*******************************************");
        System.out.println("||     >>>   Menu de Clientes   <<<      ||");
        System.out.println("*******************************************");
        System.out.println("||        01 - Cadastrar Cliente         ||");
        System.out.println("||        02 - Imprimir Clientes         ||");
        System.out.println("||        03 - Editar Cliente            ||");
        System.out.println("||        04 - Excluir Cliente           ||");
        System.out.println("||        99 - Voltar                    ||");
        System.out.println("*******************************************");
    }

    private void editarClientes(){
        System.out.println("\n");
        System.out.println("*******************************************");
        System.out.println("||      >>>   Editar Cliente   <<<       ||");
        System.out.println("*******************************************");
        System.out.println("||        01 - Id Cliente                ||");
        System.out.println("||        02 - Nome                      ||");
        System.out.println("||        03 - Email                     ||");
        System.out.println("||        04 - Desativar Cadastro        ||");
        System.out.println("||        99 - Voltar                    ||");
        System.out.println("*******************************************");
    }

    private void exibirLivros(){
        System.out.println("\n");
        System.out.println("*******************************************");
        System.out.println("||      >>>   Menu de Livros   <<<       ||");
        System.out.println("*******************************************");
        System.out.println("||    01 - Cadastrar Livros Tecnicos     ||");
        System.out.println("||    02 - Excluir Livros Tecnicos       ||");
        System.out.println("||    03 - Cadastrar Livros Comuns       ||");
        System.out.println("||    04 - Excluir Livros Comuns         ||");
        System.out.println("||    05 - Listar Todos os Livros        ||");
        System.out.println("||    99 - Voltar                        ||");
        System.out.println("*******************************************");
    }


    private void exibirLivrosPedido(){
        System.out.println("\n");
        System.out.println("*******************************************");
        System.out.println("||      >>>   Menu de Pedido   <<<       ||");
        System.out.println("*******************************************");
        System.out.println("||    01 - Acrescentar Livros Tecnicos   ||");
        System.out.println("||    02 - Acrescentar Livros Comuns     ||");
        System.out.println("||    03 - Remover item do pedido        ||");
        System.out.println("||    04 - Finalizar Pedido              ||");
        System.out.println("||    99 - Voltar                        ||");
        System.out.println("*******************************************");
    }

    private void pedidos(){
        System.out.println("\n");
        System.out.println("*******************************************");
        System.out.println("||     >>>   Menu de Pedidos   <<<       ||");
        System.out.println("*******************************************");
        System.out.println("||        01 - Cadastrar Pedido          ||");
        System.out.println("||        02 - Imprimir Pedidos          ||");
        System.out.println("||                                       ||");
        System.out.println("||                                       ||");
        System.out.println("||        99 - Voltar                   ||");
        System.out.println("*******************************************");
    }

    private void cadastrarCliente(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("\n><><><><><><><><><><><><><><><><><><><><><>\n");
        System.out.print("Quantos clientes você deseja cadastrar: \n");
        int qtdContas = leitor.nextInt();

        System.out.print("\n><><><><><><><><><><><><><><><><><><><><><>\n");

        for(int i=1; i<=qtdContas;i++) {

            System.out.print("ID do cliente: \n");
            int id = leitor.nextInt();

            System.out.print("Nome do cliente: \n");
            leitor.nextLine();// limpa o scanner
            String nome = leitor.nextLine();

            System.out.print("E-mail: \n");
            String email = leitor.next();

            System.out.print("O cadastro de " + nome + " esta ativo. \n");

            Cliente cliente = new Cliente(id, nome, email, true);

            clientes.add(cliente);

            System.out.print("\n><><><><><><><><><><><><><><><><><><><><><>\n");
        }
    }

    private Cliente pegaCliente() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nInforme a posição do cliente: \n");
        int posicao = leitor.nextInt();
        return clientes.get(posicao);
    }
    private void listarClientes(){
        System.out.print("\n><><><><><><><><><><><><><><><><><><><><><>\n");
        int posicaoArray = clientes.size();
        System.out.print("\nLista dos clientes. \n");
        for (int i=0; i<posicaoArray; i++) {
            System.out.printf("Posição %d- %s\n", i, clientes.get(i).getNome());
        }
        System.out.print("\n><><><><><><><><><><><><><><><><><><><><><>\n");
    }
   private void editarId(int posicao) {
       Scanner leitor = new Scanner(System.in);
       System.out.print("\n><><><><><><><><><><><><><><><><><><><><><>\n");
       System.out.print("ID do cliente: \n");
       int id = leitor.nextInt();
       clientes.get(posicao).setId(id);
       System.out.print("\n><><><><><><><><><><><><><><><><><><><><><>\n");
   }
    private void editarNome(int posicao) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("\n><><><><><><><><><><><><><><><><><><><><><>\n");
        System.out.print("Nome do cliente: \n");
        String nome = leitor.nextLine();
        clientes.get(posicao).setNome(nome);
        System.out.print("\n><><><><><><><><><><><><><><><><><><><><><>\n");
    }
    private void editarEmail(int posicao) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("\n><><><><><><><><><><><><><><><><><><><><><>\n");
        System.out.print("E-mail: \n");
        String email = leitor.next();
        clientes.get(posicao).setEmail(email);
        System.out.print("\n><><><><><><><><><><><><><><><><><><><><><>\n");
    }
    private void editarCadastro(int posicao) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("\n><><><><><><><><><><><><><><><><><><><><><>\n");
        clientes.get(posicao).situacaoCadastro();
        System.out.print("\nCadastro do cliente ativo(1) ou cancelado(2) \n");
        int confirmaCadastro = leitor.nextShort();
        if (confirmaCadastro > 1) {
            clientes.get(posicao).setCadastro(false);
        } else {
            clientes.get(posicao).setCadastro(true);
        }
        System.out.print("\n><><><><><><><><><><><><><><><><><><><><><>\n");
    }

    private void cadastrarLivroComum(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("\n><><><><><><><><><><><><><><><><><><><><><>\n");
        System.out.print("ID do livro: \n");
        int idLivro = leitor.nextInt();

        System.out.print("Titulo do livro: \n");
        leitor.nextLine();// limpa o scanner
        String titulo = leitor.nextLine();

        System.out.print("Nome do autor: \n");
        String autor = leitor.nextLine();

        System.out.print("Nome da editora: \n");
        String editora = leitor.nextLine();

        System.out.print("Ano de publicação: \n");
        int anoPublicacao = leitor.nextInt();

        System.out.print("Quantidade em estoque: \n");
        int qntdEstoque = leitor.nextInt();

        System.out.print("Valor(ex. 0,00): \n");
        double valorTabela = leitor.nextDouble();

        LivroComum livroComum = new LivroComum(idLivro, titulo, autor, editora, anoPublicacao, qntdEstoque, valorTabela);
        livroComum.calcIndiceRaridade();
        System.out.print("\n><><><><><><><><><><><><><><><><><><><><><>\n");
        livrosComuns.add(livroComum);
    }

    private void cadastrarLivroTecnico(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("\n><><><><><><><><><><><><><><><><><><><><><>\n");
        System.out.print("ID do livro: \n");
        int idLivro = leitor.nextInt();

        System.out.print("Titulo do livro: \n");
        leitor.nextLine();// limpa o scanner
        String titulo = leitor.nextLine();

        System.out.print("Nome do autor: \n");
        String autor = leitor.nextLine();

        System.out.print("Nome da editora: \n");
        String editora = leitor.nextLine();

        System.out.print("Ano de publicação: \n");
        int anoPublicacao = leitor.nextInt();

        System.out.print("Quantidade em estoque: \n");
        int qntdEstoque = leitor.nextInt();

        System.out.print("Valor(ex. 0,00): \n");
        double valorTabela = leitor.nextDouble();

        System.out.print("Valor adicional(ex. 0,00): \n");
        double valorAdicional = leitor.nextDouble();

        LivroTecnico livroTecnico = new LivroTecnico(idLivro, titulo, autor, editora, anoPublicacao, qntdEstoque, valorTabela, valorAdicional);
        System.out.print("\n><><><><><><><><><><><><><><><><><><><><><>\n");
        livrosTecnicos.add(livroTecnico);
    }

    private void listarLivroComum(){
        System.out.print("\n><><><><><><><><><><><><><><><><><><><><><>\n");
        int posicaoArray = livrosComuns.size();
        System.out.print("\nLista dos livros comuns. \n");
        for (int i=0; i<posicaoArray; i++) {
            System.out.printf("Posição %d - %s\n", i, livrosComuns.get(i).getTitulo());
        }
        System.out.print("\n><><><><><><><><><><><><><><><><><><><><><>\n");
    }

    private LivroTecnico pegaLivroTecnico() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nInforme a posição do LivroTecnico: \n");
        int posicao = leitor.nextInt();
        return livrosTecnicos.get(posicao);
    }
    private void listarLivroTecnico(){
        System.out.print("\n><><><><><><><><><><><><><><><><><><><><><>\n");
        int posicaoArray = livrosTecnicos.size();
        System.out.print("\nLista dos livros tecnicos. \n");
        for (int i=0; i<posicaoArray; i++) {
            System.out.printf("Posição %d - %s\n", i, livrosTecnicos.get(i).getTitulo());
        }
        System.out.print("\n><><><><><><><><><><><><><><><><><><><><><>\n");
    }

    private LivroComum pegaLivroComum() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nInforme a posição do LivroComum:\n");
        int posicao = leitor.nextInt();
        return livrosComuns.get(posicao);
    }

    private void cadastrarPedido(){
        Scanner leitor = new Scanner(System.in);
        listarClientes();
        Cliente clientepedido = pegaCliente();
        Pedido pedidoCriado = new Pedido(clientepedido, LocalDate.now(),"Pendente");

        short escolha;
        do {

            exibirLivrosPedido();
            System.out.print("Opção escolhida: \n");
            escolha = leitor.nextShort();
            int contLivroPedido = 0;

            switch (escolha) {
                case 1:
                    if (livrosTecnicos.isEmpty()) {
                        System.out.println("\nNenhum livro tecnico cadastrado.\n");
                    } else {
                        System.out.print("><><><><><><><><><><><><><><><><><><><><><>\n");
                        listarLivroTecnico();
                        System.out.print("><><><><><><><><><><><><><><><><><><><><><>\n");
                        LivroTecnico livro = pegaLivroTecnico();
                        System.out.println("\nQuantas unidades? \n");
                        int quantidade = leitor.nextInt();
                        if(livro.temEstoque(quantidade)) {
                            ItemPedido item = new ItemPedido(quantidade, livro);
                            livro.atualizandoEstoque(quantidade);
                            pedidoCriado.add(item);
                            pedidoCriado.setStatus("Registrado");
                            contLivroPedido++;
                        } else {
                            System.out.println("O livro " + livro.getTitulo() + " tem somente " + livro.getQntdEstoque() + " un. em estoque, refaça o pedido.");
                        }
                    }
                    break;
                case 2:
                    if (livrosComuns.isEmpty()) {
                        System.out.println("\nNenhum livro comum cadastrado. \n");
                    } else {
                        System.out.print("><><><><><><><><><><><><><><><><><><><><><>\n");
                        listarLivroComum();
                        System.out.print("><><><><><><><><><><><><><><><><><><><><><>\n");
                        LivroComum livro = pegaLivroComum();
                        System.out.println("\nQuantas unidades? \n");
                        int quantidade = leitor.nextInt();
                        if(livro.temEstoque(quantidade)){
                            ItemPedido item = new ItemPedido(quantidade, livro);
                            livro.atualizandoEstoque(quantidade);
                            livro.calcIndiceRaridade();
                            pedidoCriado.add(item);
                            pedidoCriado.setStatus("Registrado");
                            contLivroPedido++;
                        } else {
                            System.out.println("O livro " + livro.getTitulo() + " tem somente " + livro.getQntdEstoque() + " un. em estoque, refaça o pedido.");
                        }
                    }
                    break;
                case 3:
                    pedidoCriado.listarItens();
                    System.out.println("\nQual posição do item que desenha remover? \n");
                    int posicao = leitor.nextInt();
                    System.out.println("\nConfirme para remover o livro "+ pedidoCriado.listarItem(posicao) +" Sim(1) / Não(2)\n");
                    int confirmaRemover= leitor.nextInt();
                    if(confirmaRemover>1){
                        System.out.println("\nO livro "+ pedidoCriado.listarItem(posicao) + ", não foi removido.\n");
                    } else {
                        pedidoCriado.devolverLivro(posicao,pedidoCriado.quantidadeItem(posicao));
                        System.out.println("\nO livro "+ pedidoCriado.listarItem(posicao) + ", foi removido.\n");
                        pedidoCriado.removerItem(posicao);
                        contLivroPedido--;
                    }
                    break;
                case 4:
                    pedidoCriado.setStatus("Finalizado");
                    pedidos.add(pedidoCriado);
                    contLivroPedido=0;
                    escolha = 99;
                    break;
                case 50:
                    exibirLivrosPedido();
                    break;
                case 99:
                    if (contLivroPedido>0){
                        pedidoCriado.devolverItens();
                        contLivroPedido=0;
                    }
                    break;
                default:
                    System.out.println("Esse número não é válido. \n");
            }
        }while (escolha!=99);
    }

    private void imprimirCliente(){

        if (clientes.isEmpty()){
            System.out.println("\nNão há clientes cadastrados.");
        } else {
            System.out.print("\n><><><><><><><><><><><><><><><><><><><><><>\n");
            for (Cliente cliente : clientes) {
                System.out.println("\nId: " + cliente.getId());
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("E-mail: " + cliente.getEmail());
                cliente.situacaoCadastro();
                System.out.print("\n><><><><><><><><><><><><><><><><><><><><><>\n");
            }
        }
    }

    private void imprimirLivroComum(){
            if (livrosComuns.isEmpty()){
                System.out.println("\nNão há livros comuns cadastrados.");
            } else {
                System.out.print("\n><><><><><><><><><><><><><><><><><><><><><>\n");
                System.out.print("---------------Livros Comuns---------------\n");
                for (LivroComum livroComum : livrosComuns) {
                    System.out.println("\nId do Livro: " + livroComum.getIdLivro());
                    System.out.println("Título: " + livroComum.getTitulo());
                    System.out.println("Autor(a): " + livroComum.getAutor());
                    System.out.println("Editora: " + livroComum.getEditora());
                    System.out.println("Ano de publicação: " + livroComum.getAnoPublicacao());
                    System.out.println("Quantidade em estoque: " + livroComum.getQntdEstoque());
                    System.out.println("Valor: " + livroComum.getValorTabela());
                    System.out.println("Indice de raridade: " + livroComum.getIndiceRaridade());
                    System.out.print("\n><><><><><><><><><><><><><><><><><><><><><>\n");
                }
            }
    }

    private void imprimirLivroTecnico(){
            if (livrosTecnicos.isEmpty()){
                System.out.println("\nNão há livros comuns cadastrados.");
            } else {
                System.out.print("\n><><><><><><><><><><><><><><><><><><><><><>\n");
                System.out.print("--------------Livros Tecnicos--------------\n");
                for (LivroTecnico livroTecnico : livrosTecnicos) {
                    System.out.println("\nId do Livro: " + livroTecnico.getIdLivro());
                    System.out.println("Título: " + livroTecnico.getTitulo());
                    System.out.println("Autor(a): " + livroTecnico.getAutor());
                    System.out.println("Editora: " + livroTecnico.getEditora());
                    System.out.println("Ano de publicação: " + livroTecnico.getAnoPublicacao());
                    System.out.println("Quantidade em estoque: " + livroTecnico.getQntdEstoque());
                    System.out.println("Valor: " + livroTecnico.getValorTabela());
                    System.out.println("Valor adicional: " + livroTecnico.getValorAdicional());
                }
            }
    }

    private void imprimirPedidos(){
        if (pedidos.isEmpty()){
            System.out.println("\nNão há pedidos cadastrados.");
        } else {
            System.out.print("\n><><><><><><><><><><><><><><><><><><><><><>\n");
            for (Pedido pedido : pedidos) {
                System.out.println("\nCliente: " + pedido.getCliente().getNome());
                pedido.mostrarPedidos();
                System.out.println("Valor total do pedido: " + pedido.valorTotalPedido());
                System.out.println("Data do pedido: " + pedido.getData());
                System.out.println("Situação: " + pedido.getStatus());
                System.out.print("\n><><><><><><><><><><><><><><><><><><><><><>\n");
            }
        }
    }

    public static void main(String[] args) {
        short opcao;
        short opcaoLivros;
        short opcaoClientes;
        short opcaoEditarClie;
        short opcaoPedidos;
        int posicao;
        Scanner leitor = new Scanner(System.in);
        Principal menu = new Principal();

        do{
            menu.exibirMenu();

            System.out.print("Opção escolhida: \n");
            opcao = leitor.nextShort();

            switch(opcao){
                case 1:
                    do {
                        menu.exibirClientes();

                        System.out.print("Opção escolhida: \n");
                        opcaoClientes = leitor.nextShort();

                        switch (opcaoClientes) {
                            case 1:
                                menu.cadastrarCliente();
                                break;
                            case 2:
                                menu.imprimirCliente();
                                break;
                            case 3:
                                if (menu.clientes.isEmpty()) {
                                    System.out.print("\nNenhum cliente cadastrado. \n");
                                    opcaoClientes = 50;
                                } else {
                                    opcaoClientes = 50;
                                    menu.listarClientes();
                                    System.out.print("\nInforme a posição do cliente que deseja editar: \n");
                                    posicao = leitor.nextInt();

                                    do {
                                        menu.editarClientes();
                                        System.out.print("Opção escolhida: \n");
                                        opcaoEditarClie = leitor.nextShort();

                                        switch (opcaoEditarClie) {
                                            case 1:
                                                menu.editarId(posicao);
                                                break;
                                            case 2:
                                                menu.editarNome(posicao);
                                                break;
                                            case 3:
                                                menu.editarEmail(posicao);
                                                break;
                                            case 4:
                                                menu.editarCadastro(posicao);
                                                break;
                                            case 50:
                                                menu.editarClientes();
                                                break;
                                            case 99:
                                                break;
                                            default:
                                                System.out.print("Esse número não é válido. \n");
                                        }
                                    } while (opcaoEditarClie != 99);
                                }
                                break;
                            case 4:
                                menu.listarClientes();
                                System.out.print("\nInforme a posição do cliente que deseja excluir: \n");
                                posicao = leitor.nextInt();
                                menu.clientes.remove(posicao);
                                break;
                            case 50:
                                menu.exibirLivros();
                                break;
                            case 99:
                                break;
                            default:
                                System.out.print("Esse número não é válido. \n");
                                menu.exibirClientes();
                        }
                    }while(opcaoClientes != 99);
                    break;
                case 2:
                    do {
                        menu.exibirLivros();

                        System.out.print("Opção escolhida: \n");
                        opcaoLivros = leitor.nextShort();

                        switch (opcaoLivros) {
                            case 1:
                                menu.cadastrarLivroTecnico();
                                break;
                            case 2:
                                menu.listarLivroTecnico();
                                System.out.print("\nInforme a posição do livro tecnico que deseja excluir: \n");
                                posicao = leitor.nextInt();
                                menu.livrosTecnicos.remove(posicao);
                                break;
                            case 3:
                                menu.cadastrarLivroComum();
                                break;
                            case 4:
                                menu.listarLivroComum();
                                System.out.print("\nInforme a posição do livro comum que deseja excluir: \n");
                                posicao = leitor.nextInt();
                                menu.livrosComuns.remove(posicao);
                                break;
                            case 5:
                                menu.imprimirLivroTecnico();
                                menu.imprimirLivroComum();
                            case 50:
                                menu.exibirLivros();
                                break;
                            case 99:
                                break;
                            default:
                                System.out.print("Esse número não é válido. \n");
                        }
                    }while(opcaoLivros != 99);
                    break;
                case 3:
                    do {
                        if (menu.clientes.isEmpty()) {
                            System.out.print("\nNenhum cliente cadastrado. \n");
                            opcao = 50;
                            opcaoPedidos = 3;
                        } else {
                            menu.pedidos();
                            System.out.print("Opção escolhida: \n");
                            opcaoPedidos = leitor.nextShort();
                        }
                        switch (opcaoPedidos) {
                            case 1:
                                menu.cadastrarPedido();
                                break;
                            case 2:
                                menu.imprimirPedidos();
                                break;
                            case 50:
                                menu.pedidos();
                                break;
                            case 99:
                                break;
                            default:
                                System.out.print("Esse número não é válido. \n");
                        }

                    }while (opcaoPedidos != 99);
                    break;
                case 50:
                    menu.exibirMenu();
                    break;
                case 99:
                    System.out.print("Quer mesmo sair? Sim(1) / Não(2) \n");
                    int confirmaSair = leitor.nextShort();
                    if(confirmaSair>1){
                        opcao=50;
                    } else {
                        System.out.print("Programa finalizado.");
                    }
                    break;
                default:
                    System.out.print("Esse número não é válido. \n");
            }
        }while(opcao != 99);
        leitor.close();
    }
}