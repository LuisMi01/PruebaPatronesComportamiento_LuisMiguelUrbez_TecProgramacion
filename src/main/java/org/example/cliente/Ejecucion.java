package org.example.cliente;

import org.example.fabricas.FabricaProgramaInfinito;
import org.example.fabricas.FabricaProgramaTermina;
import org.example.fabricas.FabricaProgramas;
import org.example.negator.Negar;
import org.example.observer.observable.SujetoObservable;
import org.example.observer.observador.ObservadorBucleInfinito;
import org.example.observer.observador.ObservadorTerminacion;
import org.example.template.Programa;
public class Ejecucion {

    public static void ejecutarCodigo() {
        SujetoObservable sujetoObservable = new SujetoObservable();

        ObservadorBucleInfinito observadorInfinito = new ObservadorBucleInfinito(sujetoObservable);
        ObservadorTerminacion observadorTerminacion = new ObservadorTerminacion(sujetoObservable);

        // Implementacion de la fabrica para el programa infinito
        FabricaProgramas fabricaProgramaInfinito = new FabricaProgramaInfinito();
        Programa programaInfinito = fabricaProgramaInfinito.creaPrograma();
        programaInfinito.ejecutar();


        // Implementacion de la fabrica para el programa que termina
        FabricaProgramas fabricaProgramaTermina = new FabricaProgramaTermina();
        Programa programaTermina = fabricaProgramaTermina.creaPrograma();
        programaTermina.ejecutar();


        System.out.println("\n---------------------------\n");

        // Implementacion de la negacion para la maquina "reverser"
        System.out.println("Ejecucion de la maquina 'reverser' del teorema");
        Negar negacion = new Negar();
        System.out.println("El resultado de la maquina 'reverser' para el programa finito es: " + negacion.negarResultado(programaTermina));
        System.out.println("El resultado de la maquina 'reverser' para el programa infinito es: " + negacion.negarResultado(programaInfinito));
    }

}

