package com.example.anotacao;

public class AnotacaoApplication {

    public static void main(String[] args) {
        
        Observable carroObservable = new Observable("carro");
        Observable aviaoObservable = new Observable("aviao");

        CarroObserver observer1 = new CarroObserver();
        AviaoObserver observer2 = new AviaoObserver(); 

        carroObservable.addObserver(observer1);
        aviaoObservable.addObserver(observer2);

        carroObservable.notificarObservers("carro em movimento.");
        aviaoObservable.notificarObservers("avião em movimento.");
    }
}
