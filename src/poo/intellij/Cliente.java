package poo.intellij;

// Criação da Classe Cliente

public class Cliente {

    private int id;
    private String nome;
    private String email;
    private boolean cadastro;

    // Construtor da classe Cliente

    public Cliente(int id, String nome, String email, boolean cadastro) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cadastro = cadastro;
    }

    // Getters

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }

    public void getCadastro() {
        String resposta;
        if (this.cadastro){
            resposta="ativo";
        } else {
            resposta="cancelado";
        }
        System.out.println("O cliente " + this.nome + " está com o seu cadastro " + resposta + ".");
    }

    // Setters

    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setCadastro(boolean situacao) {
        this.cadastro = situacao;
        getCadastro();
    }

}
