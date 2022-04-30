package model;

public class Produto {
    private float valor;
    private String cor;

    public float getValor() {
        return valor;
    }

    public String getCor() {
        return cor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "valor=" + valor +
                ", cor='" + cor + '\'' +
                '}';
    }
}
