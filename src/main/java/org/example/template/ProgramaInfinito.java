package org.example.template;


import org.example.observer.observable.SujetoObservable;

import java.util.Scanner;

public class ProgramaInfinito extends Programa {
    private float limiteIteraciones;

    private SujetoObservable sujetoObservable;
    public ProgramaInfinito(SujetoObservable sujetoObservable) {
        this.sujetoObservable = sujetoObservable;
    }

    @Override
    protected void cargarCodigo() {
        System.out.println("PROGRAMA INFINITO");
    }

    @Override
    protected void configurarEntrada() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cual quieres que sea el numero de iteraciones maximas del programa infinito?");
        limiteIteraciones = teclado.nextInt();
    }

    @Override
    protected void ejecutarPrograma() {
        int numero = 1;
        boolean bucleInfinito = false;

        for (int i = 0; i < limiteIteraciones; i++) {
            System.out.println(numero);
            numero++;

            if (numero == limiteIteraciones) {
                bucleInfinito = true;
                break;
            }
        }

        if (bucleInfinito) {
            sujetoObservable.notificarObservadores(false);
        }
    }
}
