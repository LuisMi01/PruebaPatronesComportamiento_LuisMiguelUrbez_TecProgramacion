package org.example.observer.observador;

import org.example.observer.observable.SujetoObservable;

public class ObservadorBucleInfinito implements Observador{
        private SujetoObservable sujetoObservable;

        public ObservadorBucleInfinito(SujetoObservable sujetoObservable) {
                this.sujetoObservable = sujetoObservable;
                this.sujetoObservable.registrarObservador(this);
        }

        public void actualizarTerminado() {
                System.out.println(".");
        }
        @Override
        public void actualizarInfinito() {
                System.out.println("El template entró en un bucle infinito");
        }
}
