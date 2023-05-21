package org.example.teoremaparada;

import org.example.programa.Programa;

public class EstrategiaAleatoria implements EstrategiaDetencion{
    public boolean detectarBucle(Programa programa) {
        // Implementa aquí la lógica de detección de bucle de manera aleatoria
        // Retorna true si se detecta un bucle infinito, false en caso contrario
        return Math.random() < 0.5; // Ejemplo simple de detección aleatoria
    }
}
