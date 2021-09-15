package POO.Trabalho;

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

    public float calcularTotalItem(){
        return quantidade * produto.getValor();
    }
}
