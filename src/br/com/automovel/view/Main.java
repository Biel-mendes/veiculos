package br.com.automovel.view;

import br.com.automovel.model.Carro;
import br.com.automovel.model.Moto;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.setModelo("Corolla");
        meuCarro.setMarca("Toyota");
        meuCarro.setPortas(4);
        meuCarro.setAno(2009);
        meuCarro.abastecer();
        meuCarro.ligar();
        meuCarro.mostraVeiculo();


        for (int i = 0; i < meuCarro.getNoTanque(); i = 0){
            meuCarro.acelerar();
            meuCarro.acelerar();
            meuCarro.freiar();
        }

        meuCarro.desligar();
        meuCarro.mostraVeiculo();

        Moto minhaMoto = new Moto();

        minhaMoto.setModelo("CB 500");
        minhaMoto.setMarca("Honda");
        minhaMoto.setAno(2015);
        minhaMoto.abastecer();
        minhaMoto.ligar();
        minhaMoto.mostraVeiculo();


        for (int i = 0; i < minhaMoto.getNoTanque(); i = 0){
            minhaMoto.acelerar();
            minhaMoto.acelerar();
            minhaMoto.freiar();
        }

        minhaMoto.desligar();
        minhaMoto.mostraVeiculo();

    }
}
