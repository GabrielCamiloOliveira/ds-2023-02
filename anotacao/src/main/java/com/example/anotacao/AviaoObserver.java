package com.example.anotacao;

import java.util.Date;

@Observer(observado = "aviao")
class AviaoObserver implements CustomObserver {
    @Override
    public void update(String message) {
        Date date = new Date();
        System.out.println(date + " - Mensagem Recebida (Avião): " + message);
    }
}
