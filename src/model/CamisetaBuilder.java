package model;

public class CamisetaBuilder {
    private Camiseta camiseta;
    private Produto produto;

    public CamisetaBuilder() {
        this.camiseta = new Camiseta();
        this.produto = new Produto();
    }

    public static CamisetaBuilder builder() {
        return new CamisetaBuilder();
    }
    public CamisetaBuilder addCamiseta(CamisetaTamanho tamanho, String marca) {
        camiseta.setTamanho(tamanho);
        camiseta.setMarca(marca);
        return this;
    }

    public CamisetaBuilder addProduto(String cor, float valor) {
        produto.setCor(cor);
        produto.setValor(valor);
        return this;
    }

    public Camiseta get() {
        camiseta.setProduto(produto);
        return camiseta;
    }

}
