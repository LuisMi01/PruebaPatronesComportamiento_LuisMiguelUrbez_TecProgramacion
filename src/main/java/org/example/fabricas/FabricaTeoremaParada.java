package org.example.fabricas;

import org.example.teoremaparada.EstrategiaDetencion;
import org.example.teoremaparada.EstrategiaTeoremaParada;

public class FabricaTeoremaParada implements FabricaEstrategias{

    @Override
    public EstrategiaDetencion fabricar(){
        return new EstrategiaTeoremaParada();
    }
}
