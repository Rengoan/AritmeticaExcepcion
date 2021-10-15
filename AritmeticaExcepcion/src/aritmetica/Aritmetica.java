package aritmetica;

import excepciones.OperacionesExcepcion;

public class Aritmetica {

    public static int division(int numerador, int denominador)throws OperacionesExcepcion{
        if (denominador == 0) {
            throw new OperacionesExcepcion("Division entre 0");
        }
        return numerador / denominador;
    }
}
