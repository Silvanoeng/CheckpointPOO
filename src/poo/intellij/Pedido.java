package poo.intellij;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<ItemPedido> pedido = new ArrayList<> ();
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


    public List<ItemPedido> getPedido() {
        return pedido;
    }

    public void setPedido(List<ItemPedido> pedido) {
        this.pedido = pedido;
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

//    public double calcularTotalPedido(ItemPedido[] itens){
//
//        double total = 0;
//        for (ItemPedido item : itens) {
//            total = total + item.calcularTotalItem();
//        }
//        return total;
//    }
}