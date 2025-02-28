package com.azarquiel.s2daw.apiEsqui.dto;

import com.azarquiel.s2daw.apiEsqui.model.Estacion;
import lombok.*;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * DTO for {@link com.azarquiel.s2daw.apiEsqui.model.Provincia}
 */
@AllArgsConstructor
@Getter
@Setter
@Value
public class ProvinciaDto implements Serializable {
    Short id;
    String nombre;
    List<Estacion> estacions;
}