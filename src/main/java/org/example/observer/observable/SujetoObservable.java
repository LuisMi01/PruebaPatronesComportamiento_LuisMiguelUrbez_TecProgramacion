package org.example.observer.observable;

import org.example.observer.observador.Observador;
import java.util.ArrayList;
import java.util.List;
public class SujetoObservable {
    private List<Observador> observadores;

    public SujetoObservable() {
        this.observadores = new ArrayList<>();
    }

    public void registrarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void notificarObservadores(boolean terminado) {
        //si es true, se notifica a los observadores de terminacion si es false, se notifica a los observadores de bucle infinito
        if (terminado) {
            for (Observador observador : observadores) {
                observador.actualizarTerminado();
            }
        } else {
            for (Observador observador : observadores) {
                observador.actualizarInfinito();
            }
        }
    }
}
