package org.example.template;

public abstract class Programa {
    public void ejecutar(){
        cargarCodigo();
        configurarEntrada();
        ejecutarPrograma();

    }

    protected abstract void cargarCodigo();

    protected abstract void configurarEntrada();

    protected abstract void ejecutarPrograma();

}
