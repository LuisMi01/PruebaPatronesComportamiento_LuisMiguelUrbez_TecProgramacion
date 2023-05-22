package org.example.observer.observador;

import org.example.observer.observable.SujetoObservable;

public class ObservadorTerminacion implements Observador {
    private SujetoObservable sujetoObservable;

    public ObservadorTerminacion(SujetoObservable sujetoObservable) {
        this.sujetoObservable = sujetoObservable;
        this.sujetoObservable.registrarObservador(this);
    }

    @Override
    public void actualizarInfinito() {
        System.out.println(".");
    }

    @Override
    public void actualizarTerminado() {
        System.out.println("El template no entro en un bucle y termino su ejecucion");
    }
}
