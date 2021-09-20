package poo.intellij;

// Criação da classe Abstrata Livro

public abstract class Livro {
    private int idLivro;
    private String titulo;
    private String autor;
    private String editora;
    private int anoPublicacao;
    private int qntdEstoque;
    private double valorTabela;

    // Construtor da Classe Livro

    public Livro(int idLivro, String titulo, String autor, String editora, int anoPublicacao, int qntdEstoque, double valorTabela) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.qntdEstoque = qntdEstoque;
        this.valorTabela = valorTabela;
    }

    // Função abstrata para calcular os preços dos livros

    public abstract double calcPreco();

    // Getters

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

    // Setters

    public void setQntdEstoque(int qntdEstoque) {
        this.qntdEstoque = qntdEstoque;
    }


    // Funções para o atributo estoque

    public boolean temEstoque(int qntdVendida){
        return ((this.qntdEstoque - qntdVendida) > 0 ? true : false);
    }

    public void atualizandoEstoque(int qntdVendida){
        setQntdEstoque(this.qntdEstoque - qntdVendida);
    }

    public void devolverEstoque(int qntd){
        setQntdEstoque(this.qntdEstoque + qntd);
    }

}
