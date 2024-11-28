package exercicios;

public class Circulo implements Forma{
    private double raio;
    private double pi = 3.14;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return (getRaio() * getRaio()) * getPi();
    }
}
