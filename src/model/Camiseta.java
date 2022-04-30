package model;

public class Camiseta {

    private CamisetaTamanho tamanho;
    private Produto produto;
    private String marca;

    public CamisetaTamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(CamisetaTamanho tamanho) {
        this.tamanho = tamanho;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Camiseta{" +
                "tamanho=" + tamanho +
                ", produto=" + produto +
                ", marca='" + marca + '\'' +
                '}';
    }
}
