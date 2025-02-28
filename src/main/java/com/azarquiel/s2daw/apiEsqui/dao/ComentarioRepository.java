package com.azarquiel.s2daw.apiEsqui.dao;

import com.azarquiel.s2daw.apiEsqui.model.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Integer> {
}