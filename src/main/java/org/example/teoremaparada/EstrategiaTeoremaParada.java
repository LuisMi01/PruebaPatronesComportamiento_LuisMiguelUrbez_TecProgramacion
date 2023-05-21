package org.example.teoremaparada;

import org.example.programa.Programa;

public class EstrategiaTeoremaParada implements EstrategiaDetencion{
        @Override
        public boolean detectarBucle(Programa programa) {
            // En este ejemplo, asumiremos que no se puede detectar un bucle infinito y siempre devolvemos false
            return false;
        }


}
