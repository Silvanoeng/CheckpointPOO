package poo.intellij;

// Criação da classe LivroTecnico

public class LivroTecnico extends Livro {
    private double valorAdicional;

    // Construtor da Classe LivroTecnico

    public LivroTecnico(int idLivro, String titulo, String autor, String editora, int anoPublicacao, int qntdEstoque, double valorTabela, double valorAdicional) {
        super(idLivro, titulo, autor, editora, anoPublicacao, qntdEstoque, valorTabela);
        this.valorAdicional = valorAdicional;
    }

    // Sobrescrita de calcPreco() para adaptá-la à função abstrata

    @Override
    public double calcPreco() {
        return (this.getValorTabela() + this.valorAdicional);
    }

    // Getter

    public double getValorAdicional() {
        return valorAdicional;
    }
}
