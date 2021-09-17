package poo.intellij;

public class ItemPedido {
    private int quantidade;
    private LivroComum livroC;
    private LivroTecnico livroT;

    public ItemPedido(int quantidade, LivroComum livroC) {
        this.quantidade = quantidade;
        this.livroC = livroC;
    }

    public ItemPedido(int quantidade, LivroTecnico livroT) {
        this.quantidade = quantidade;
        this.livroT = livroT;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public LivroComum getLivroC() {
        return this.livroC;
    }

    public void setLivroC(LivroComum livroC) {
        this.livroC = livroC;
    }

    public LivroTecnico getLivroT() {
        return this.livroT;
    }

    public void setLivroT(LivroTecnico livroT) {
        this.livroT = livroT;
    }

    public double calcularTotalLivroC() {

        return (this.quantidade * this.livroC.calcPreco());
    }
    public double calcularTotalLivroT() {

        return (this.quantidade * this.livroT.calcPreco());
    }

    public static void main(String[] args) {
        LivroComum te = new LivroComum(12, "oi", "ele", "globo", 1999, 12, 100.50);
        LivroTecnico ta = new LivroTecnico(14,"solo","Maria","la",1999,45,45.55,1.00);

        ItemPedido teste = new ItemPedido(3, te);
        ItemPedido taste = new ItemPedido(4, ta);

        System.out.println(teste.calcularTotalLivroC());
        System.out.println(taste.calcularTotalLivroT());
        System.out.println(50.55);
    }


}
