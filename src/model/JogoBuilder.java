package model;

public class JogoBuilder {
    private Jogo jogo;
    private Produto produto;

    public JogoBuilder() {
        this.jogo = new Jogo();
        this.produto = new Produto();
    }

    public static JogoBuilder builder() {
        return new JogoBuilder();
    }
    public JogoBuilder addJogo(String nome, JogoTipo tipo) {
        jogo.setNome(nome);
        jogo.setTipo(tipo);
        return this;
    }

    public JogoBuilder addProduto(float valor) {
        produto.setValor(valor);
        return this;
    }

    public Jogo get() {
        jogo.setProduto(produto);
        return jogo;
    }
}
