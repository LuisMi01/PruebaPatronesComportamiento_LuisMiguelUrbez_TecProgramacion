package org.example.observer;

public class ObservadorTerminacion implements Observador {
    @Override
    public void actualizar(boolean bucleInfinito) {
        if (!bucleInfinito) {
            System.out.println("El programa terminó correctamente");
        }
    }
}
