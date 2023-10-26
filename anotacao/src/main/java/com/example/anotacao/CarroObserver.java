package com.example.anotacao;

import java.util.Date;

@Observer(observado = "carro")
class CarroObserver implements CustomObserver {
    @Override
    public void update(String message) {
        Date date = new Date();
        System.out.println(date + " - Mensagem recebida (Carro): " + message);
    }
}
