package com.example.anotacao;
import java.util.ArrayList;
import java.util.List;

public class Observable {

    private List<CustomObserver> observers = new ArrayList<>();
    private String identificador;

    public Observable(String identificador) {
        this.identificador = identificador;
    }

    public void addObserver(CustomObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(CustomObserver observer) {
        observers.remove(observer);
    }

    public void notificarObservers(String message) {
        for (CustomObserver observer : observers) {
            observer.update(message);
        }
    }

    public String getIdentificador() {
        return identificador;
    }
}
