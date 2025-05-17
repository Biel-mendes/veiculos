package br.com.automovel.model;

public class Veiculo {
    private String modelo;
    private String marca;
    private int ano;
    private double velocidade = 0.0;
    private double noTanque = 0.0;
    private boolean ligado = false;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isLigado() {
        return ligado;
    }

    protected boolean setLigado(boolean ligado) {
        this.ligado = ligado;
        return ligado;
    }

    public double getNoTanque() {
        return noTanque;
    }

    protected void setNoTanque(double noTanque) {
        this.noTanque = noTanque;
    }

    public double getVelocidade() {
        return velocidade;
    }

    protected void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void mostraVeiculo(){
    }
}
