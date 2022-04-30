package model;

public class Calcado {
    private int numero;
    private Produto produto;
    private CalcadoTipo tipo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public CalcadoTipo getTipo() {
        return tipo;
    }

    public void setTipo(CalcadoTipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Calcado{" +
                "numero=" + numero +
                ", produto=" + produto +
                ", tipo=" + tipo +
                '}';
    }
}
