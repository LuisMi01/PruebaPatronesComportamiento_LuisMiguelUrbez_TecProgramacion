package org.example.observer;

public class ObservadorBucleInfinito implements Observador{
        @Override
        public void actualizar(boolean bucleInfinito) {
            if (bucleInfinito) {
                System.out.println("Se detectó un bucle infinito en el programa");
            }
        }
}
