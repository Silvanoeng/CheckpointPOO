package POO.TrabalhoFinal;

public class ItemPedido {
    private double quantidade;
    private Livro livro;

    public ItemPedido(double quantidade, Livro livro) {
        this.quantidade = quantidade;
        this.livro = livro;
    }

    public double getQuantidade() {
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

    public double calcularTotalItem(){
        return quantidade * livro.calcPreco();
    }
}
