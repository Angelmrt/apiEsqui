package com.azarquiel.s2daw.apiEsqui.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Set;

/**
 * DTO for {@link com.azarquiel.s2daw.apiEsqui.model.Usuario}
 */
@AllArgsConstructor
@Getter
@Setter
@Value
public class UsuarioDto implements Serializable {
    Short id;
    String nick;
    String pass;
    Set<ComentarioDto> comentarios;
}