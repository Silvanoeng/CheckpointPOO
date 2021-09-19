package poo.intellij;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private ArrayList<ItemPedido> pedido = new ArrayList<>();
    private LocalDate data;
    private String status;

    public Pedido(Cliente cliente, LocalDate data, String status) {
        this.cliente = cliente;
        this.data = data;
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public void mostrarPedidos() {
        for(ItemPedido item: pedido){
            System.out.printf("%s, %d un. valor total R$ %.2f\n", item.getLivro().getTitulo(), item.getQuantidade(), item.calcularTotalLivro());
        };
    }

    public void devolverLivro(int posicao, int quantidade){
        pedido.get(posicao).getLivro().devolverEstoque(quantidade);
    }

    public void devolverItens() {
        for(int i=0; i<pedido.size(); i++){
            pedido.get(i).getLivro().devolverEstoque(pedido.get(i).getQuantidade());;
        };
    }

    public void listarItens() {
        for(int i=0; i<pedido.size(); i++){
            System.out.printf("Posição %d - %d un. - %s \n", i, pedido.get(i).getQuantidade(), pedido.get(i).getLivro().getTitulo());
        };
    }

    public double valorTotalPedido() {
        double valor = 0.00;
        for(ItemPedido item: pedido){
            valor += item.calcularTotalLivro();
        };
        return valor;
    }

    public String listarItem(int posicao){
    return pedido.get(posicao).getLivro().getTitulo();
    }

    public int quantidadeItem(int posicao){
        return pedido.get(posicao).getQuantidade();
    }

    public void removerItem(int posicao){
        pedido.remove(posicao);
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void add(ItemPedido itemPedido) {
        pedido.add(itemPedido);
    }


}