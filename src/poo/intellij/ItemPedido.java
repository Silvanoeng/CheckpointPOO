package poo.intellij;

// Criação da classe ItemPedido

public class ItemPedido {
    private int quantidade;
    private Livro livro;

    public ItemPedido(int quantidade, Livro livro) {
        this.quantidade = quantidade;
        this.livro = livro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public double calcularTotalLivro() {

        return (this.quantidade * this.livro.calcPreco());
    }


}
