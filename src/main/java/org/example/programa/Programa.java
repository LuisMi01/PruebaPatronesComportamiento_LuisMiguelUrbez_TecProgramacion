package org.example.programa;

import org.example.teoremaparada.EstrategiaDetencion;

public abstract class Programa {
    public void ejecutar(EstrategiaDetencion estrategia){
        cargarCodigo();
        configurarEntrada();
        ejecutarPrograma();

        boolean bucleInfinito = estrategia.detectarBucle(this);

        if (bucleInfinito) {
            accionBucleInfinito();
        } else {
            accionTerminacion();
        }
    }

    protected abstract void cargarCodigo();

    protected abstract void configurarEntrada();

    protected abstract void ejecutarPrograma();

    protected abstract void accionBucleInfinito();

    protected abstract void accionTerminacion();
}
