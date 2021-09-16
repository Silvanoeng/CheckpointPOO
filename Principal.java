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

    private void cadastrarCliente(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("ID do cliente: ");
        int idCliente = leitor.nextInt();

        System.out.print("Nome do cliente: ");
        leitor.nextLine();// limpa o scanner
        String nomeCliente = leitor.nextLine();

        System.out.print("CPF: ");
        int cpf = leitor.nextInt();

        System.out.print("Agora vamos cadastrar o endereço.\n");
        System.out.print("Rua: ");
        leitor.nextLine();// limpa o scanner
        String rua = leitor.nextLine();

        System.out.print("Número: ");
        int numero = leitor.nextInt();

        System.out.print("Cep: ");
        int cep = leitor.nextInt();

        Cliente cliente = new Cliente(idCliente,nomeCliente,cpf,rua,numero,cep);

        clientes.add(cliente);

    }
    private void cadastrarLivrosNacionais(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("ID do livro: ");
        int idLivro = leitor.nextInt();

        System.out.print("Nome do livro: ");
        leitor.nextLine();// limpa o scanner
        String nome = leitor.nextLine();

        System.out.print("Nome do autor: ");
        leitor.nextLine();// limpa o scanner
        String autor = leitor.nextLine();

        LiteraturaNacional nacional = new LiteraturaNacional(idLivro, nome, autor);

        livrosNacionais.add(nacional);

    }

    private void cadastrarLivrosEstrangeiros(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("ID do livro: ");
        int idLivro = leitor.nextInt();

        System.out.print("Nome do livro: ");
        leitor.nextLine();// limpa o scanner
        String nome = leitor.nextLine();

        System.out.print("Nome do autor: ");
        leitor.nextLine();// limpa o scanner
        String autor = leitor.nextLine();

        LiteraturaEstrangeira internacional = new LiteraturaEstrangeira(idLivro, nome, autor);

        livrosInternacionais.add(internacional);

    }

    private void imprimirCliente(){
        for(Cliente cliente : clientes){
            System.out.println("\nId: " + cliente.getIdCliente());
            System.out.println("Nome: " + cliente.getNomeCliente());
            System.out.println("Nome: " + cliente.getCpf());
            System.out.println("Nome: " + cliente.getRua());
            System.out.println("Nome: " + cliente.getNumero());
            System.out.println("Nome: " + cliente.getCep());
        }
    }
    private void imprimirLivrosNacionais(){
        for(LiteraturaNacional nacional : livrosNacionais){
            System.out.println("\nId: " + nacional.getIdLivro());
            System.out.println("Nome: " + nacional.getNome());
            System.out.println("Autor: " + nacional.getAutor());
            System.out.println("Categoria: " + nacional.getCategoria());
        }
    }
    private void imprimirLivrosEstrangeiros(){
        for(LiteraturaEstrangeira internacional  : livrosInternacionais){
            System.out.println("\nId: " + internacional.getIdLivro());
            System.out.println("Nome: " + internacional.getNome());
            System.out.println("Autor: " + internacional.getAutor());
            System.out.println("Categoria: " + internacional.getCategoria());
        }
    }

    public static void main(String[] args){
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
                                menu.cadastrarLivrosNacionais();
                                break;
                            case 2:
                                menu.cadastrarLivrosEstrangeiros();
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
                    menu.imprimirLivrosNacionais();
                    menu.imprimirLivrosEstrangeiros();
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