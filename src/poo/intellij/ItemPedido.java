package poo.intellij;

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


    public static void main(String[] args) {
        LivroComum te = new LivroComum(12, "oi", "ele", "globo", 1999, 12, 100.50);
        LivroTecnico ta = new LivroTecnico(14,"solo","Maria","la",1999,45,45.55,1.00);

        ItemPedido teste = new ItemPedido(3, te);
        ItemPedido taste = new ItemPedido(4, ta);

        System.out.println(teste.calcularTotalLivro());
        System.out.println(taste.calcularTotalLivro());
        System.out.println(50.55);
    }


}
