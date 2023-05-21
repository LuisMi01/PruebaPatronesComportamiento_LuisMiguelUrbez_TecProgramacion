package org.example.teoremaparada;

import org.example.programa.Programa;

import java.util.Random;

public class EstrategiaAleatoria implements EstrategiaDetencion{
    public boolean detectarBucle(Programa programa) {
        Random random = new Random();
        return random.nextBoolean();
    }
}
