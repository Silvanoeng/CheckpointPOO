package POO.TrabalhoFinal;

public abstract class Livro {
    private int idLivro;
    private String titulo;
    private String autor;
    private String editora;
    private int anoPublicacao;
    private int qntdEstoque;
    private double valorTabela;

    public Livro(int idLivro, String titulo, String autor, String editora, int anoPublicacao, int qntdEstoque, double valorTabela) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.qntdEstoque = qntdEstoque;
        this.valorTabela = valorTabela;
    }

    public abstract double calcPreco();

    public int getQntdEstoque() {
        return qntdEstoque;
    }

    public double getValorTabela() {
        return valorTabela;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
}
