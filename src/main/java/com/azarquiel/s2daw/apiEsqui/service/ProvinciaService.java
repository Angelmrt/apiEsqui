package com.azarquiel.s2daw.apiEsqui.service;

import com.azarquiel.s2daw.apiEsqui.dto.ProvinciaDto;
import com.azarquiel.s2daw.apiEsqui.model.Provincia;

import java.util.Optional;
import java.util.Set;

public interface ProvinciaService {

    Set<ProvinciaDto> findAll();
    Optional<Provincia> findById(Short id);
}
