package org.example;

import org.example.fabricas.FabricaTeoremaParada;
import org.example.programa.Programa;
import org.example.programa.ProgramaFactorial;
import org.example.programa.ProgramaFibonacci;
import org.example.teoremaparada.EstrategiaDetencion;

public class Ejecucion {

    public static void ejecutarCodigo(){

        // Crear una fábrica de teorema de la parada
        FabricaTeoremaParada fabricaTeoremaParada = new FabricaTeoremaParada();

        // Obtener una instancia de la estrategia aleatoria
        EstrategiaDetencion estrategiaAleatoria = fabricaTeoremaParada.fabricar();

        // Crear un programa Fibonacci con límite 100
        Programa programaFibonacci = new ProgramaFibonacci(0);

        // Ejecutar el programa Fibonacci con la estrategia aleatoria
        programaFibonacci.ejecutar(estrategiaAleatoria);

        System.out.println("---------------------------");

        // Crear un programa Factorial con número 5
        Programa programaFactorial = new ProgramaFactorial(5);

        // Ejecutar el programa Factorial con la estrategia aleatoria
        programaFactorial.ejecutar(estrategiaAleatoria);

    }
}
