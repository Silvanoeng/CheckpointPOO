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
    public double valorTotalPedido() {
        double valor = 0.00;
        for(ItemPedido item: pedido){
             valor += item.calcularTotalLivro();
        };
        return valor;
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