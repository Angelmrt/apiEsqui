package com.azarquiel.s2daw.apiEsqui.service;

import com.azarquiel.s2daw.apiEsqui.dao.ProvinciaRepository;
import com.azarquiel.s2daw.apiEsqui.dto.ProvinciaDto;
import com.azarquiel.s2daw.apiEsqui.model.Provincia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;
@Service
public class ProvinciaServiceImpl implements ProvinciaService {

    private ProvinciaRepository repository;

    @Autowired
    public ProvinciaServiceImpl(ProvinciaRepository provinciaRepository) {
        this.repository = provinciaRepository;
    }



    @Override
    public Set<ProvinciaDto> findAll() {



        return null;
    }

    @Override
    public Optional<Provincia> findById(Short id) {
        return repository.findById(id);
    }
}
