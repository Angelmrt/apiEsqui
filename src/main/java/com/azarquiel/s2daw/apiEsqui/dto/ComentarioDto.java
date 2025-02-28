package com.azarquiel.s2daw.apiEsqui.dto;

import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link com.azarquiel.s2daw.apiEsqui.model.Comentario}
 */
@AllArgsConstructor
@Getter
@Setter
@Value
public class ComentarioDto implements Serializable {
    Integer id;
    String comentario;
}