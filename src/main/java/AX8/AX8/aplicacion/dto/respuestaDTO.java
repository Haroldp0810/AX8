package AX8.AX8.aplicacion.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter

public class respuestaDTO<T> {

    private T valor;
}
