package poo.intellij;

import java.time.LocalDate;
import java.util.ArrayList;

// Criação da classe Pedido

public class Pedido {
    private Cliente cliente;
    private ArrayList<ItemPedido> pedido = new ArrayList<>();
    private LocalDate data;
    private String status;

    // Construtor da classe Pedido

    public Pedido(Cliente cliente, LocalDate data, String status) {
        this.cliente = cliente;
        this.data = data;
        this.status = status;
    }

    // Getters

    public Cliente getCliente() {
        return cliente;
    }
    public ArrayList<ItemPedido> getPedido() {
        return pedido;
    }
    public LocalDate getData() {
        return data;
    }
    public String getStatus() {
        return status;
    }

    // Setter

    public void setStatus(String status) {
        this.status = status;
    }

    public void mostrarPedidos() {
        for(ItemPedido item: pedido){
            System.out.printf("%s, %d un. valor total R$ %.2f\n", item.getLivro().getTitulo(), item.getQuantidade(), item.calcularTotalLivro());
        };
    }

    // Função criada para que o usuário possa excluir o item do pedido

    public void desistirDoItem(int posicao, int quantidade){
        pedido.get(posicao).getLivro().devolverEstoque(quantidade);
    }

    // Função criada para ser usada quando o usuário sai do pedido sem finalizar a compra

    public void desistirDaCompra() {
        for(int i=0; i<pedido.size(); i++){
            pedido.get(i).getLivro().devolverEstoque(pedido.get(i).getQuantidade());;
        };
    }

    // Funções usadas para listar os itens, antes da remoção de um item do pedido

    public void listarItens() {
        for(int i=0; i<pedido.size(); i++){
            System.out.printf("Posição %d - %d un. - %s \n", i, pedido.get(i).getQuantidade(), pedido.get(i).getLivro().getTitulo());
        };
    }

    public String listarItemParaRemover(int posicao){
    return pedido.get(posicao).getLivro().getTitulo();
    }



    // Função criada para pegar a quantidade

    public int quantidadeItem(int posicao){
        return pedido.get(posicao).getQuantidade();
    }

    // Função criada para remover um item

    public void removerItem(int posicao){
        pedido.remove(posicao);
    }

    // Função criada para calcular e apresentar o valor total do pedido

    public double valorTotalPedido() {
        double valor = 0.00;
        for(ItemPedido item: pedido){
             valor += item.calcularTotalLivro();
        };
        return valor;
    }

    // Função criada para adicionar um item pedido ao pedido

    public void add(ItemPedido itemPedido) {
        pedido.add(itemPedido);
    }

}