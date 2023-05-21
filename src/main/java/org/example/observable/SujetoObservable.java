package org.example.observable;

import org.example.observer.Observador;

import java.util.ArrayList;
import java.util.List;

public class SujetoObservable {

    private final List<Observador> observadores = new ArrayList<>();

    public void registrarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores(boolean bucleInfinito) {
        for (Observador observador : observadores) {
            observador.actualizar(bucleInfinito);
        }
    }
    }



