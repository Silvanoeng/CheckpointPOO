package POO.TrabalhoFinal;

public class LivroComum extends Livro implements Comparable <LivroComum> {
    private int indiceRaridade;

    public LivroComum(int idLivro, String titulo, String autor, String editora, int anoPublicacao, int qntdEstoque, double valorTabela) {
        super(idLivro, titulo, autor, editora, anoPublicacao, qntdEstoque, valorTabela);
    }

    public void setIndiceRaridade(int indiceRaridade) {
        this.indiceRaridade = indiceRaridade;
    }

    public int calcIndiceRaridade(){
        if (this.getQntdEstoque() < 10)
            return 6;
        else if (this.getQntdEstoque() >= 10 && this.getQntdEstoque() < 500)
            return 4;
        else
            return 0;
    }

    @Override
    public double calcPreco(){
        return this.getValorTabela();
    }

    public int getIndiceRaridade() {
        return indiceRaridade;
    }

    @Override
    public int compareTo(LivroComum livroComum){
        if(this.indiceRaridade == livroComum.getIndiceRaridade()){
            System.out.println("Ambos os livros são igualmente raros.");
            return 0;
        } else if(this.indiceRaridade > livroComum.getIndiceRaridade()){
            System.out.println("Esse livro é mais raro, portanto, não espere para comprá-lo, pois não há muitos no estoque.");
            return 1;
        } else{
            System.out.println("Esse livro é menos raro, portanto, ainda há uma boa quantidade no estoque.");
            return -1;
        }
    }

}
