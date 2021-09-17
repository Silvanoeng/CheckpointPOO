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
        System.out.println("||    01 - Clientes                      ||");
        System.out.println("||    02 - Livros                        ||");
        System.out.println("||    03 - Pedidos                       ||");
        System.out.println("||    04 - Imprimir lista de Clientes    ||");
        System.out.println("||    05 - Imprimir lista de Livros      ||");
        System.out.println("||    99 - Sair                          ||");
        System.out.println("*******************************************");
    }

    private void exibirClientes(){
        System.out.println("\n");
        System.out.println("*******************************************");
        System.out.println("||      >>>   Menu de Clientes   <<      ||");
        System.out.println("*******************************************");
        System.out.println("||        01 - Cadastrar Cliente         ||");
        System.out.println("||        02 - Editar Cliente            ||");
        System.out.println("||        03 - Voltar                    ||");
        System.out.println("||        99 - Sair                      ||");
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
        System.out.println("||        05 - Voltar                    ||");
        System.out.println("||        99 - Sair                      ||");
        System.out.println("*******************************************");
    }

    private void exibirLivros(){
        System.out.println("\n");
        System.out.println("*******************************************");
        System.out.println("||       >>>   Menu de Livros   <<       ||");
        System.out.println("*******************************************");
        System.out.println("||         01 - Livros Tecnicos          ||");
        System.out.println("||         02 - Livros Comuns            ||");
        System.out.println("||         03 - Voltar                   ||");
        System.out.println("||         99 - Sair                     ||");
        System.out.println("*******************************************");
    }

    private void livrosComuns(){
        System.out.println("\n");
        System.out.println("*******************************************");
        System.out.println("||    >>>   Menu de Livros Comuns   <<   ||");
        System.out.println("*******************************************");
        System.out.println("||         01 - Cadastrar Livro          ||");
        System.out.println("||         02 - Editar Livro             ||");
        System.out.println("||         03 - Voltar                   ||");
        System.out.println("||         99 - Sair                     ||");
        System.out.println("*******************************************");
    }

    private void livrosTecnicos(){
        System.out.println("\n");
        System.out.println("*******************************************");
        System.out.println("||  >>>   Menu de Livros Tecnicos   <<   ||");
        System.out.println("*******************************************");
        System.out.println("||         01 - Cadastrar Livro          ||");
        System.out.println("||         02 - Editar Livro             ||");
        System.out.println("||         03 - Voltar                   ||");
        System.out.println("||         99 - Sair                     ||");
        System.out.println("*******************************************");
    }

    private void pedidos(){
        System.out.println("\n");
        System.out.println("*******************************************");
        System.out.println("||      >>>   Menu de Pedidos   <<       ||");
        System.out.println("*******************************************");
        System.out.println("||         01 - Cadastrar Pedido         ||");
        System.out.println("||         02 - Editar Pedido            ||");
        System.out.println("||         03 - Voltar                   ||");
        System.out.println("||         99 - Sair                     ||");
        System.out.println("*******************************************");
    }

    private void cadastrarCliente(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Quantos clientes você deseja cadastrar: ");
        int qtdContas = leitor.nextInt();

        System.out.print("\n<><><><><><><><><><><><><><><><><><>\n");

        for(int i=1; i<=qtdContas;i++) {

            System.out.print("ID do cliente: ");
            int id = leitor.nextInt();

            System.out.print("Nome do cliente: ");
            leitor.nextLine();// limpa o scanner
            String nome = leitor.nextLine();

            System.out.print("E-mail: ");
            String email = leitor.next();

            System.out.print("O cadastro de " + nome + " esta ativo.");
            boolean cadastro = true;

            Cliente cliente = new Cliente(id, nome, email, cadastro);

            clientes.add(cliente);

            System.out.print("\n<><><><><><><><><><><><><><><><><><>\n");

        }
    }
    private boolean temClientes(){
        if (clientes.isEmpty()){
        return true;
        } else {return false;
        }
    }
    private Cliente pegaCliente() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nInforme a posição do cliente:\n");
        int posicao = leitor.nextInt();
        return clientes.get(posicao);
    }
    private void listarClientes(){
        System.out.print("\n<><><><><><><><><><><><><><><><><><>\n");
        int posicaoArray = clientes.size();
        System.out.print("\nLista dos clientes.\n");
        for (int i=0; i<posicaoArray; i++) {
            System.out.printf("Posição %d- %s\n", i, clientes.get(i).getNome());
        }
        System.out.print("\n<><><><><><><><><><><><><><><><><><>\n");
    }
   private void editarId(int posicao) {
       Scanner leitor = new Scanner(System.in);
       System.out.print("ID do cliente: ");
       int id = leitor.nextInt();
       clientes.get(posicao).setId(id);
   }
    private void editarNome(int posicao) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Nome do cliente: ");
        leitor.nextLine();// limpa o scanner
        String nome = leitor.nextLine();
        clientes.get(posicao).setNome(nome);
    }
    private void editarEmail(int posicao) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("E-mail: ");
        String email = leitor.next();
        clientes.get(posicao).setEmail(email);
    }
    private void editarCadastro(int posicao) {
        Scanner leitor = new Scanner(System.in);
        clientes.get(posicao).situacaoCadastro();
        System.out.print("Deixar o cadastro do cliente ativo(1) ou cancelado(2)");
        int confirmaCadastro = leitor.nextShort();
        if (confirmaCadastro > 1) {
            clientes.get(posicao).setCadastro(false);
        } else {
            clientes.get(posicao).setCadastro(false);
        }
    }

    private void cadastrarLivroComum(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("ID do livro: ");
        int idLivro = leitor.nextInt();

        System.out.print("Titulo do livro: ");
        leitor.nextLine();// limpa o scanner
        String titulo = leitor.nextLine();

        System.out.print("Nome do autor: ");
        leitor.nextLine();// limpa o scanner
        String autor = leitor.nextLine();

        System.out.print("Nome da editora: ");
        leitor.nextLine();// limpa o scanner
        String editora = leitor.nextLine();

        System.out.print("Ano de publicação: ");
        int anoPublicacao = leitor.nextInt();

        System.out.print("Quantidade em estoque: ");
        int qntdEstoque = leitor.nextInt();

        System.out.print("Valor: ");
        double valorTabela = leitor.nextDouble();

        LivroComum livroComum = new LivroComum(idLivro, titulo, autor, editora, anoPublicacao, qntdEstoque, valorTabela);
        livroComum.calcIndiceRaridade();
        livrosComuns.add(livroComum);
    }

    private void cadastrarLivroTecnico(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("ID do livro: ");
        int idLivro = leitor.nextInt();

        System.out.print("Titulo do livro: ");
        leitor.nextLine();// limpa o scanner
        String titulo = leitor.nextLine();

        System.out.print("Nome do autor: ");
        leitor.nextLine();// limpa o scanner
        String autor = leitor.nextLine();

        System.out.print("Nome da editora: ");
        leitor.nextLine();// limpa o scanner
        String editora = leitor.nextLine();

        System.out.print("Ano de publicação: ");
        int anoPublicacao = leitor.nextInt();

        System.out.print("Quantidade em estoque: ");
        int qntdEstoque = leitor.nextInt();

        System.out.print("Valor: ");
        double valorTabela = leitor.nextDouble();

        System.out.print("Valor adicional: ");
        double valorAdicional = leitor.nextDouble();

        LivroTecnico livroTecnico = new LivroTecnico(idLivro, titulo, autor, editora, anoPublicacao, qntdEstoque, valorTabela, valorAdicional);

        livrosTecnicos.add(livroTecnico);
    }

    private boolean temLivroTecnico(){
        if (livrosTecnicos.isEmpty()){
            return true;
        } else {return false;
        }
    }

    private boolean temLivroComum(){
        if (livrosComuns.isEmpty()){
            return true;
        } else {return false;
        }
    }
    private void listarLivroComum(){
        System.out.print("\n<><><><><><><><><><><><><><><><><><>\n");
        int posicaoArray = livrosComuns.size();
        System.out.print("\nLista dos livros comuns.\n");
        for (int i=0; i<posicaoArray; i++) {
            System.out.printf("Posição %d- %s\n", i, livrosComuns.get(i).getTitulo());
        }
        System.out.print("\n<><><><><><><><><><><><><><><><><><>\n");
    }

    private LivroTecnico pegaLivroTecnico() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nInforme a posição do LivroTecnico:\n");
        int posicao = leitor.nextInt();
        return livrosTecnicos.get(posicao);
    }
    private void listarLivroTecnico(){
        System.out.print("\n<><><><><><><><><><><><><><><><><><>\n");
        int posicaoArray = livrosTecnicos.size();
        System.out.print("\nLista dos livros tecnicos.\n");
        for (int i=0; i<posicaoArray; i++) {
            System.out.printf("Posição %d- %s\n", i, livrosTecnicos.get(i).getTitulo());
        }
        System.out.print("\n<><><><><><><><><><><><><><><><><><>\n");
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
        Pedido pedido = new Pedido(clientepedido, LocalDate.now(),"Cadastrando");

        System.out.println("\nLivro Tecnico (1) // Livro Comum (2)\n");

        short escolha=50;
        do {
            escolha = leitor.nextShort();
            switch (escolha) {
                case 1:
                    if (temLivroTecnico()) {
                        System.out.println("\nNenhum livro tecnico cadastrado.\n");
                    } else {
                        listarLivroComum();
                        LivroTecnico livro = pegaLivroTecnico();
                        System.out.println("\nQuantas unidades?\n");
                        int quantidade = leitor.nextInt();
                        ItemPedido item = new ItemPedido(quantidade, livro);
                        pedido.setPedido((List<ItemPedido>) item);
                    }
                case 2:
                    if (temLivroComum()) {
                        System.out.println("\nNenhum livro comum cadastrado.\n");
                    } else {
                        listarLivroTecnico();
                        LivroComum livro = pegaLivroComum();
                        System.out.println("\nQuantas unidades?\n");
                        int quantidade = leitor.nextInt();
                        ItemPedido item = new ItemPedido(quantidade, livro);
                        pedido.setPedido((List<ItemPedido>) item);
                    }
                default:
                    System.out.println("Esse número não é válido.");
            }
        }while (escolha!=99);

        pedidos.add(pedido);

    }

    private void imprimirCliente(){

        if (clientes.isEmpty()){
            System.out.println("\nNão há clientes cadastrados.");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println("\nId: " + cliente.getId());
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("E-mail: " + cliente.getEmail());
                cliente.situacaoCadastro();
            }
        }
    }

    private void imprimirLivroComum(){
            if (livrosComuns.isEmpty()){
                System.out.println("\nNão há livros comuns cadastrados.");
            } else {
                for (LivroComum livroComum : livrosComuns) {
                    System.out.println("\nId do Livro: " + livroComum.getIdLivro());
                    System.out.println("Título: " + livroComum.getTitulo());
                    System.out.println("Autor(a): " + livroComum.getAutor());
                    System.out.println("Editora: " + livroComum.getEditora());
                    System.out.println("Ano de publicação: " + livroComum.getAnoPublicacao());
                    System.out.println("Quantidade em estoque: " + livroComum.getQntdEstoque());
                    System.out.println("Valor: " + livroComum.getValorTabela());
                    System.out.println("Indice de raridade: " + livroComum.getIndiceRaridade());
                }
            }
    }

    private void imprimirLivroTecnico(){
            if (livrosTecnicos.isEmpty()){
                System.out.println("\nNão há livros comuns cadastrados.");
            } else {
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


    public static void main(String[] args) {
        short opcao = 50;
        short opcaoLivros = 50;
        short opcaoLivrosTec = 50;
        short opcaoLivrosCom = 50;
        short opcaoClientes = 50;
        short opcaoEditarClie = 50;
        short opcaoPedidos = 50;
        int posicaoCliente=0;
        Scanner leitor = new Scanner(System.in);
        Principal menu = new Principal();

        do{
            menu.exibirMenu();

            System.out.print("Opção escolhida: ");
            opcao = leitor.nextShort();

            switch(opcao){
                case 1:
                    do {
                        menu.exibirClientes();

                        System.out.print("Opção escolhida: ");
                        opcaoClientes = leitor.nextShort();

                        switch (opcaoClientes) {
                            case 1:
                                menu.cadastrarCliente();
                                break;
                            case 2:
                                if (menu.temClientes()) {
                                    System.out.print("\nNenhum cliente cadastrado.\n");
                                    opcaoClientes = 50;
                                } else {
                                    opcaoClientes = 50;
                                    menu.listarClientes();
                                    System.out.print("\nInforme a posição do cliente que deseja editar:\n");
                                    posicaoCliente = leitor.nextInt();

                                    do {
                                        menu.editarClientes();
                                        System.out.print("Opção escolhida: ");
                                        opcaoEditarClie = leitor.nextShort();

                                        switch (opcaoEditarClie) {
                                            case 1:
                                                menu.editarId(posicaoCliente);
                                                break;
                                            case 2:
                                                menu.editarNome(posicaoCliente);
                                                break;
                                            case 3:
                                                menu.editarEmail(posicaoCliente);
                                                break;
                                            case 4:
                                                menu.editarCadastro(posicaoCliente);
                                                break;
                                            case 5:
                                                opcaoEditarClie = 99;
                                                break;
                                            case 50:
                                                menu.editarClientes();
                                                break;
                                            case 99:
                                                System.out.print("Quer mesmo sair? Sim(1) / Não(2) ");
                                                int confirmaSair = leitor.nextShort();
                                                if (confirmaSair > 1) {
                                                    opcaoEditarClie = 50;
                                                } else {
                                                    System.out.print("Programa finalizado.");
                                                    opcaoClientes = 99;
                                                    opcao = 99;
                                                }
                                                break;
                                            default:
                                                System.out.print("Esse número não é válido.");
                                        }
                                    } while (opcaoEditarClie != 99);
                                }
                                break;
                            case 3:
                                opcaoClientes = 99;
                                break;
                            case 50:
                                menu.exibirLivros();
                                break;
                            case 99:
                                System.out.print("Quer mesmo sair? Sim(1) / Não(2) ");
                                int confirmaSair = leitor.nextShort();
                                if(confirmaSair>1){
                                    opcaoClientes=50;
                                } else {
                                    System.out.print("Programa finalizado.");
                                    opcao = 99;
                                }
                                break;
                            default:
                                System.out.print("Esse número não é válido.");
                                menu.exibirClientes();
                        }
                    }while(opcaoClientes != 99);
                    break;
                case 2:
                    do {
                        menu.exibirLivros();

                        System.out.print("Opção escolhida: ");
                        opcaoLivros = leitor.nextShort();

                        switch (opcaoLivros) {
                            case 1:
                                do {
                                    menu.livrosTecnicos();

                                    System.out.print("Opção escolhida: ");
                                    opcaoLivrosTec = leitor.nextShort();
                                    switch (opcaoLivrosTec) {
                                        case 01:
                                            menu.cadastrarLivroTecnico();
                                            break;
                                        case 02:
                                            break;
                                        case 03:
                                            opcaoLivrosTec = 99;
                                            opcaoLivros = 50;
                                            break;
                                        case 50:
                                            menu.livrosTecnicos();
                                            break;
                                        case 99:
                                            System.out.print("Quer mesmo sair? Sim(1) / Não(2) ");
                                            int confirmaSair = leitor.nextShort();
                                            if(confirmaSair>1){
                                                opcaoLivrosTec = 50;
                                            } else {
                                                System.out.print("Programa finalizado.");
                                                opcaoLivros = 99;
                                                opcao = 99;
                                            }
                                            break;
                                        default:
                                            System.out.print("Esse número não é válido.");
                                    }

                                }while (opcaoLivrosTec != 99);
                                break;
                            case 2:
                                do {
                                    menu.livrosComuns();

                                    System.out.print("Opção escolhida: ");
                                    opcaoLivrosCom = leitor.nextShort();
                                    switch (opcaoLivrosCom) {
                                        case 01:
                                            menu.cadastrarLivroComum();
                                            break;
                                        case 02:
                                            break;
                                        case 03:
                                            opcaoLivrosCom = 99;
                                            opcaoLivros = 50;
                                            break;
                                        case 50:
                                            menu.livrosComuns();
                                            break;
                                        case 99:
                                            System.out.print("Quer mesmo sair? Sim(1) / Não(2) ");
                                            int confirmaSair = leitor.nextShort();
                                            if(confirmaSair>1){
                                                opcaoLivrosCom = 50;
                                            } else {
                                                System.out.print("Programa finalizado.");
                                                opcaoLivros = 99;
                                                opcao = 99;
                                            }
                                            break;
                                        default:
                                            System.out.print("Esse número não é válido.");
                                    }

                                }while (opcaoLivrosCom != 99);
                                break;
                            case 3:
                                opcaoLivros = 99;
                                break;
                            case 50:
                                menu.exibirLivros();
                                break;
                            case 99:
                                System.out.print("Quer mesmo sair? Sim(1) / Não(2) ");
                                int confirmaSair = leitor.nextShort();
                                if(confirmaSair>1){
                                    opcaoLivros=50;
                                } else {
                                    System.out.print("Programa finalizado.");
                                    opcao = 99;
                                }
                                break;
                            default:
                                System.out.print("Esse número não é válido.");
                        }
                    }while(opcaoLivros != 99);
                    break;
                case 3:
                    do {

                        if (menu.temClientes()) {
                            System.out.print("\nNenhum cliente cadastrado.\n");
                            opcao = 50;
                        } else  {
                            menu.pedidos();
                        }

                        System.out.print("Opção escolhida: ");
                        opcaoPedidos = leitor.nextShort();
                        switch (opcaoPedidos) {
                            case 01:
                                menu.cadastrarPedido();
                                break;
                            case 02:
                                //editar Pedido
                                break;
                            case 03:
                                opcaoPedidos = 99;
                                opcao = 50;
                                break;
                            case 50:
                                menu.pedidos();
                                break;
                            case 99:
                                System.out.print("Quer mesmo sair? Sim(1) / Não(2) ");
                                int confirmaSair = leitor.nextShort();
                                if(confirmaSair>1){
                                    opcaoPedidos = 50;
                                } else {
                                    System.out.print("Programa finalizado.");
                                    opcao = 99;
                                }
                                break;
                            default:
                                System.out.print("Esse número não é válido.");
                        }

                    }while (opcaoPedidos != 99);
                    break;
                case 4:
                    menu.imprimirCliente();
                    break;
                case 5:
                    menu.imprimirLivroTecnico();
                    menu.imprimirLivroComum();
                    break;
                case 50:
                    menu.exibirMenu();
                    break;
                case 99:
                    System.out.print("Quer mesmo sair? Sim(1) / Não(2) ");
                    int confirmaSair = leitor.nextShort();
                    if(confirmaSair>1){
                        opcao=50;
                    } else {
                        System.out.print("Programa finalizado.");
                    }
                    break;
                default:
                    System.out.print("Esse número não é válido.");
            }
        }while(opcao != 99);
    }
}