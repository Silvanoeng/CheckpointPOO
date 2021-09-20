package poo.intellij;

// Criação da classe ItemPedido

public class ItemPedido {
    private int quantidade;
    private Livro livro;

//    Construtor
    public ItemPedido(int quantidade, Livro livro) {
        this.quantidade = quantidade;
        this.livro = livro;
    }

//    Gets
    public int getQuantidade() {
        return quantidade;
    }
    public Livro getLivro() {
        return livro;
    }

//    Metodo para calcular o total do item
    public double calcularTotalLivro() {

        return (this.quantidade * this.livro.calcPreco());
    }

}
