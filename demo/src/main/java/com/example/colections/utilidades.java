package com.example.colections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class utilidades {


    public static <T> List<T> filtrar(List<T> lista, Predicate<T> criterio) {
        List<T> resultado = new ArrayList<>();
        for (T elemento : lista) {
            if (criterio.test(elemento)) {
                resultado.add(elemento);
            }
        }
        return resultado;
    }
}
