package org.example.programa;

public class ProgramaFactorial extends Programa {

    private int numero;
    private int factorial;

    public ProgramaFactorial(int numero) {
        this.numero = numero;
    }

    @Override
    protected void cargarCodigo() {
        System.out.println("Cargando código del programa Factorial");
    }

    @Override
    protected void configurarEntrada() {
        System.out.println("Configurando entrada del programa Factorial");
    }

    @Override
    protected void ejecutarPrograma() {
        System.out.println("Ejecutando programa Factorial");
        factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }

    private int calcularFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }

    @Override
    protected void accionBucleInfinito() {
        System.out.println("Se detectó un bucle infinito en el programa Factorial");
    }

    @Override
    protected void accionTerminacion() {
        System.out.println("El programa Factorial terminó correctamente");
    }
}


