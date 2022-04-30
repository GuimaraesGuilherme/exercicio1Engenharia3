package model;

public class CalcadoBuilder {
    private Calcado calcado;
    private Produto produto;

    public CalcadoBuilder() {
        this.calcado = new Calcado();
        this.produto = new Produto();
    }

    public static CalcadoBuilder builder() {
        return new CalcadoBuilder();
    }
    public CalcadoBuilder addCalcado(int numero, CalcadoTipo tipo) {
        calcado.setNumero(numero);
        calcado.setTipo(tipo);
        return this;
    }

    public CalcadoBuilder addProduto(String cor, float valor) {
        produto.setCor(cor);
        produto.setValor(valor);
        return this;
    }

    public Calcado get() {
        calcado.setProduto(produto);
        return calcado;
    }
}
