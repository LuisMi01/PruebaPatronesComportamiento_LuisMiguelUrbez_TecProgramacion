package org.example.template;

import org.example.observer.observable.SujetoObservable;
import org.example.observer.observador.ObservadorTerminacion;

import java.util.Scanner;

public class ProgramaTermina extends Programa {

    private int numero;
    private SujetoObservable sujetoObservable;

    public ProgramaTermina(SujetoObservable sujetoObservable) {
        this.sujetoObservable = sujetoObservable;
    }


    @Override
    protected void cargarCodigo() {
        System.out.println("PROGRAMA FINITO");
    }

    @Override
    protected void configurarEntrada() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el numero del cual quiera calcular el factorial:");
        numero = teclado.nextInt();
    }

    @Override
    protected void ejecutarPrograma() {
        int factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);
        sujetoObservable.notificarObservadores(true);
    }

    private int calcularFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }
}


