package org.example.fabricas;

import org.example.observer.observable.SujetoObservable;
import org.example.template.Programa;
import org.example.template.ProgramaInfinito;

public class FabricaProgramaInfinito implements FabricaProgramas{
    SujetoObservable sujetoObservable = new SujetoObservable();
    public Programa creaPrograma() {
        return new ProgramaInfinito(sujetoObservable);
    }
}
