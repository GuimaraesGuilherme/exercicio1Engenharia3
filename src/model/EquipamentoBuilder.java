package model;

public class EquipamentoBuilder {
    private Equipamento equipamento;
    private Produto produto;

    public EquipamentoBuilder() {
        this.equipamento = new Equipamento();
        this.produto = new Produto();
    }

    public static EquipamentoBuilder builder() {
        return new EquipamentoBuilder();
    }
    public EquipamentoBuilder addEquipamento(EquipamentoTipo tipo, float capacidade,String fabricante ) {
        equipamento.setTipo(tipo);
        equipamento.setCapacidade(capacidade);
        equipamento.setFabricante(fabricante);
        return this;
    }

    public EquipamentoBuilder addProduto(float valor) {
        produto.setValor(valor);
        return this;
    }

    public Equipamento get() {
        equipamento.setProduto(produto);
        return equipamento;
    }
}
