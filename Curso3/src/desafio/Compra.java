package desafio;

public class Compra {
    private String descricao;
    private double valor;


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return getDescricao() + " - " + getValor();
    }
}
