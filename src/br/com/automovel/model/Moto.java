package br.com.automovel.model;

import br.com.automovel.controller.ControlaAuto;

public class Moto extends Veiculo implements ControlaAuto {
    private boolean empinada = false;

    public void empinar(){
        if (!empinada){
            System.out.println("Moto empinada");
            empinada = true;
        }else {
            System.out.println("Moto já esta empinada");
        }
    }

    public void desempinar(){
        if (!empinada){
            System.out.println("moto já desempinada");
        }else {
            System.out.println("moto desempinada");
            empinada = false;
        }
    }


    @Override
    public void acelerar() {
        if(!this.isLigado() || this.getNoTanque() <= 5){

            if (this.getNoTanque() <= 5){
                System.out.println("sua gasolina acabou!");
                setVelocidade(0);
                setNoTanque(0);
                System.out.println("sua velocidade é " + this.getVelocidade());
            } else if (!this.isLigado()) {
                System.out.println("impossivel acelerar a moto desligado, ligue a moto");
                setVelocidade(0);
                System.out.println("sua velocidade é " + this.getVelocidade());
            }

        }else{
            this.setVelocidade(getVelocidade() + 20.0);
            this.setNoTanque(getNoTanque() - 5.0);
            System.out.println("sua velocidade é " + this.getVelocidade());
            System.out.println("sua tanque está em " + this.getNoTanque());
        }
    }

    @Override
    public void freiar() {
        if(!this.setLigado(true)){
            System.out.println("impossivel acelerar a moto desligado, ligue a moto");
        }else if(this.getVelocidade() <= 20.0){
            System.out.println("impossivel frear a moto parado");;
        }else {
            this.setVelocidade(getVelocidade() - 20.0);
            System.out.println("sua velocidade é " + getVelocidade());
        }
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abastecer() {
        if (getNoTanque() >= 40.0){
            System.out.println("tanque cheio!");
        }else {
            System.out.println("Tanque abastecido ");
            this.setNoTanque(40.0);
            System.out.println("seu tanque esta em " + getNoTanque());
        }

    }

    @Override
    public void mostraVeiculo() {
        System.out.println("A marca de sua moto é " + this.getMarca());
        System.out.println("A modelo de sua moto é " + this.getMarca());
        System.out.println("O ano de sua moto é " + this.getAno());
        String onoff = isLigado() ? "ligado" : "desligado";
        System.out.println("A moto está " + onoff);
        System.out.println("A velocidade de sua moto é " + this.getVelocidade());
        System.out.println("Quantidade de combustivel " + this.getNoTanque());
    }

}
