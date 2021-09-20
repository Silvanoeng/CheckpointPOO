package poo.intellij;

public class LivroComum extends Livro {
    private int indiceRaridade;

//    Constructor
    public LivroComum(int idLivro, String titulo, String autor, String editora, int anoPublicacao, int qntdEstoque, double valorTabela) {
        super(idLivro, titulo, autor, editora, anoPublicacao, qntdEstoque, valorTabela);
    }

//    Get
    public int getIndiceRaridade() {
        return indiceRaridade;
    }

//    Set
    public void setIndiceRaridade(int indiceRaridade) {
        this.indiceRaridade = indiceRaridade;
    }

//    Calcula o indice de raridade para dar o set no atributo.
    public void calcIndiceRaridade(){
        if (this.getQntdEstoque() < 10)
            setIndiceRaridade (6);
        else if (this.getQntdEstoque() >= 10 && this.getQntdEstoque() < 500)
            setIndiceRaridade (4);
        else
            setIndiceRaridade (0);
    }

//    Sobreescrita do metodo da classe abstrata.
    @Override
    public double calcPreco(){
        return this.getValorTabela();
    }

}