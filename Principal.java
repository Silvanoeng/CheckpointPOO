package POO.TrabalhoFinal;

import POO.TrabalhoFinal.LivroComum;

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
        System.out.println("||    03 - Imprimir lista de Clientes    ||");
        System.out.println("||    04 - Imprimir lista de Livros      ||");
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
        System.out.println("||        03 - Pedidos do Cliente        ||");
        System.out.println("||        04 - Voltar                    ||");
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
        System.out.println("||  >>>   Menu de Pedidos   <<   ||");
        System.out.println("*******************************************");
        System.out.println("||         01 - Cadastrar Pedido          ||");
        System.out.println("||         02 - Editar Pedido             ||");
        System.out.println("||         03 - Voltar                   ||");
        System.out.println("||         99 - Sair                     ||");
        System.out.println("*******************************************");
    }

    private void cadastrarCliente(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("ID do cliente: ");
        int id = leitor.nextInt();

        System.out.print("Nome do cliente: ");
        leitor.nextLine();// limpa o scanner
        String nome = leitor.nextLine();

        System.out.print("E-mail: ");
        leitor.nextLine();// limpa o scanner
        String email = leitor.nextLine();

        boolean cadastro = true;

        Cliente cliente = new Cliente(id,nome,email,cadastro);

        clientes.add(cliente);
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
        leitor.nextLine();// limpa o scanner
        int anoPublicacao = leitor.nextInt();

        System.out.print("Quantidade em estoque: ");
        leitor.nextLine();// limpa o scanner
        int qntdEstoque = leitor.nextInt();

        System.out.print("Valor: ");
        leitor.nextLine();// limpa o scanner
        double valorTabela = leitor.nextDouble();

        LivroComum livro = new LivroComum(idLivro, titulo, autor, editora, anoPublicacao, qntdEstoque, valorTabela);
        livro.setIndiceRaridade(livro.calcIndiceRaridade());
        livrosComuns.add(livro);
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
        leitor.nextLine();// limpa o scanner
        int anoPublicacao = leitor.nextInt();

        System.out.print("Quantidade em estoque: ");
        leitor.nextLine();// limpa o scanner
        int qntdEstoque = leitor.nextInt();

        System.out.print("Valor: ");
        leitor.nextLine();// limpa o scanner
        double valorTabela = leitor.nextDouble();

        System.out.print("Valor adicional: ");
        leitor.nextLine();// limpa o scanner
        double valorAdicional = leitor.nextDouble();

        LivroTecnico livro = new LivroTecnico(idLivro, titulo, autor, editora, anoPublicacao, qntdEstoque, valorTabela, valorAdicional);

        livrosTecnicos.add(livro);
    }

//    private void cadastrarPedido(){
//        Scanner leitor = new Scanner(System.in);
//
//        System.out.print("ID do cliente: ");
//        int id = leitor.nextInt();
//
//        System.out.print("Nome do cliente: ");
//        leitor.nextLine();// limpa o scanner
//        String nome = leitor.nextLine();
//
//        System.out.print("E-mail: ");
//        leitor.nextLine();// limpa o scanner
//        String email = leitor.nextLine();
//
//        boolean cadastro = true;
//
//        Cliente cliente = new Cliente(id,nome,email,cadastro);
//
//        clientes.add(cliente);
//    }

    private void imprimirCliente(){
        for(Cliente cliente : clientes){
            System.out.println("\nId: " + cliente.getId());
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("E-mail: " + cliente.getEmail());
            cliente.situacaoCadastro();
        }
    }

    private void imprimirLivroComum(){
        for(LivroComum livroComum : livrosComuns){
            System.out.println("\nId do Livro: " + livroComum.getIdLivro());
            System.out.println("Título: " + livroComum.getTitulo());
            System.out.println("Autor(a): " + livroComum.getAutor());
            System.out.println("Editora: " + livroComum.getEditora());
            System.out.println("Ano de publicação: " + livroComum.getAnoPublicacao());
            System.out.println("Quantidade em estoque: " + livroComum.getQntdEstoque());
            System.out.println("Valor: " + livroComum.getValorTabela());
            livroComum.getIndiceRaridade();
        }
    }

    private void imprimirLivroTecnico(){
        for(LivroTecnico livroTecnico : livrosTecnicos){
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



    public static void main(String[] args) {
        short opcao = 50;
        short opcaoLivros =50;
        Scanner leitor = new Scanner(System.in);
        Principal menu = new Principal();

        do{
            menu.exibirMenu();

            System.out.print("Opção escolhida: ");
            opcao = leitor.nextShort();

            switch(opcao){
                case 1:
                    menu.cadastrarCliente();
                    break;
                case 2:
                    do {
                        menu.exibirLivros();

                        System.out.print("Opção escolhida: ");
                        opcaoLivros = leitor.nextShort();

                        switch (opcaoLivros) {
                            case 1:
                                menu.cadastrarLivroTecnico();
                                break;
                            case 2:
                                menu.cadastrarLivroComum();
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
                                menu.exibirLivros();
                        }
                    }while(opcaoLivros != 99);
                    break;
                case 3:
                    menu.imprimirCliente();
                    break;
                case 4:
                    menu.imprimirCliente();
                    menu.imprimirCliente();
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
                    menu.exibirMenu();
            }
        }while(opcao != 99);
    }
}