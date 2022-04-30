package model;

public class Jogo {
    private String nome;
    private JogoTipo tipo;
    private Produto produto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public JogoTipo getTipo() {
        return tipo;
    }

    public void setTipo(JogoTipo tipo) {
        this.tipo = tipo;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo +
                ", produto=" + produto +
                '}';
    }
}
