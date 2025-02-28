package com.azarquiel.s2daw.apiEsqui.dto;

import com.azarquiel.s2daw.apiEsqui.model.Comentario;
import com.azarquiel.s2daw.apiEsqui.model.Imagen;
import lombok.*;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * DTO for {@link com.azarquiel.s2daw.apiEsqui.model.Estacion}
 */
@AllArgsConstructor
@Getter
@Setter
@Value
public class EstacionDto implements Serializable {
    Short id;
    String nombre;
    String logo;
    String plano;
    Short km;
    List<Comentario> comentarios;
    List<Imagen> imagens;
}