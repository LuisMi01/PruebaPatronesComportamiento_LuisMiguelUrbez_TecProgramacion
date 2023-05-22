package org.example.fabricas;

import org.example.observer.observable.SujetoObservable;
import org.example.template.Programa;
import org.example.template.ProgramaTermina;

public class FabricaProgramaTermina implements FabricaProgramas{
    SujetoObservable sujetoObservable = new SujetoObservable();
    public Programa creaPrograma() {
        return new ProgramaTermina(sujetoObservable);
    }
}
