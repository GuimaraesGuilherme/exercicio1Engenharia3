package model;

public class Equipamento {
    private EquipamentoTipo tipo;
    private float capacidade;
    private String fabricante;

    private Produto produto;

    public EquipamentoTipo getTipo() {
        return tipo;
    }

    public void setTipo(EquipamentoTipo tipo) {
        this.tipo = tipo;
    }

    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Equipamento{" +
                "tipo=" + tipo +
                ", capacidade=" + capacidade +
                ", fabricante='" + fabricante + '\'' +
                ", produto=" + produto +
                '}';
    }
}
