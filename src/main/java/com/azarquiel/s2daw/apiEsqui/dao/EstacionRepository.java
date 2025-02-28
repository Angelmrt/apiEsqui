package com.azarquiel.s2daw.apiEsqui.dao;

import com.azarquiel.s2daw.apiEsqui.model.Estacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstacionRepository extends JpaRepository<Estacion, Short> {
}