package org.example.observer;

public class ObservadorBucleInfinito implements Observador{
        @Override
        public void actualizar(boolean bucleInfinito) {
            if (bucleInfinito) {
                System.out.println("Se ha detectado un bucle infinito.");
                // Realiza aquí las acciones correspondientes cuando se detecta un bucle infinito
            }
        }
}
