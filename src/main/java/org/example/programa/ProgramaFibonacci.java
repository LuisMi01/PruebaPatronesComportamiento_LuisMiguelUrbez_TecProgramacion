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
        System.out.println("Ejecutando programa Fibonacci");
        int a = 0;
        int b = 1;
        int c = 0;
        while (c < limite) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
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
