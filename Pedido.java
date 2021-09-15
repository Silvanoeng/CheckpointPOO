package POO.TrabalhoFinal;

import java.sql.SQLClientInfoException;
import java.time.LocalDate;

public class Pedido {
    private Cliente cliente;
    private ItemVenda[] itens;
    private LocalDate data;
    private String status;

    public Pedido(Cliente cliente, ItemVenda[] itens, LocalDate data, String status) {
        this.cliente = cliente;
        this.itens = itens;
        this.data = data;
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemVenda[] getItens() {
        return itens;
    }

    public void setItens(ItemVenda[] itens) {
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
    public float calcularTotalPedido(){
        float total = 0;
        for (ItemVenda item : itens) {
            total = valor + item.calcularTotalItem();
        }
        return total;
    }
}
