package POO.TrabalhoFinal;

import java.time.LocalDate;

public class Pedido {
    private Cliente cliente;
    private ItemPedido[] itens;
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

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
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

    public double calcularTotalPedido(ItemPedido[] itens){

        double total = 0;
        for (ItemPedido item : itens) {
            total = total + item.calcularTotalItem();
        }
        return total;
    }
}
