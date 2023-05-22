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
        if (terminado) {
            observadores.forEach(Observador::actualizarTerminado);
        } else {
            observadores.forEach(Observador::actualizarInfinito);
        }
    }
}
