package AX8.AX8.dominio.validador;

import java.util.List;

public class ValidadroArgumento {
    private ValidadroArgumento(){}

    public static void validarObligatorio(String valor, String mensaje){
        if(valor == null || valor.isBlank()){
            throw new IllegalArgumentException(mensaje);
        }
    }

    public static void validarLongitud(String valor, String mensaje){
        if (valor == null || valor.isBlank()){
            throw new IllegalArgumentException(mensaje);
        }
    }

    public static void validarNoVacia(List<? extends Object> lista, String mensaje){
        if(lista == null || lista.isEmpty()){
            throw new IllegalArgumentException(mensaje);

        }
    }
}
