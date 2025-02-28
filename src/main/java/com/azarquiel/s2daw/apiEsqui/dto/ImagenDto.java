package com.azarquiel.s2daw.apiEsqui.dto;

import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link com.azarquiel.s2daw.apiEsqui.model.Imagen}
 */
@AllArgsConstructor
@Getter
@Setter
@Value
public class ImagenDto implements Serializable {
    Short id;
    String foto;
}