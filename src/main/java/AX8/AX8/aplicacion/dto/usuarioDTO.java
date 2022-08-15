package AX8.AX8.aplicacion.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/*
Etiquetas lombook

Funcionamiento:

@NoArgsConstructor: Genera un Constructor sin parametros
@AllArgsConstructor: Genera un constructor con un paramentro para cada campo de su clase
@Gettery/o @Setterpara permitir que lombok genere el getter/setter predeterminado automáticamente.


 */

@NoArgsConstructor
@AllArgsConstructor
@Getter


public class usuarioDTO {
    private String usuario;
    private String clave;
}
