package POO.TrabalhoFinal;

public class LivroTecnico extends Livro {
    private double valorAdicional;

    public LivroTecnico(int idLivro, String titulo, String autor, String editora, int anoPublicacao, int qntdEstoque, double valorTabela, double valorAdicional) {
        super(idLivro, titulo, autor, editora, anoPublicacao, qntdEstoque, valorTabela);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public double calcPreco() {
        return this.getValorTabela() + this.valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }
}
