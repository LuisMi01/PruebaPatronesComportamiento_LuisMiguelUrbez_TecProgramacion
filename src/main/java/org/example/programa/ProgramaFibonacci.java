package org.example.programa;

public class ProgramaFibonacci extends Programa{
    private int limite;

    public ProgramaFibonacci(int limite) {
        this.limite = limite;
    }

    @Override
    protected void cargarCodigo(){
        System.out.println("Cargando código del programa Fibonacci");
    }

    @Override
    protected void configurarEntrada(){
        System.out.println("Configurando entrada del programa Fibonacci");
    }

    @Override
    protected void ejecutarPrograma(){
        int limite = 1;

        do {
            System.out.println(limite);
            limite++;
        } while (limite != 0);
    }


    @Override
    protected void accionBucleInfinito(){
        System.out.println("Se detectó un bucle infinito en el programa Fibonacci");
    }

    @Override
    protected void accionTerminacion(){
        System.out.println("El programa Fibonacci terminó correctamente");
    }
}
