package org.example.fabricas;

import org.example.teoremaparada.EstrategiaAleatoria;
import org.example.teoremaparada.EstrategiaDetencion;

public class FabricaAleatoria implements FabricaEstrategias{

        @Override
        public EstrategiaDetencion fabricar(){
            return new EstrategiaAleatoria();
        }
}
