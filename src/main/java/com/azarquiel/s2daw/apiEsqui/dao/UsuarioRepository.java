package com.azarquiel.s2daw.apiEsqui.dao;

import com.azarquiel.s2daw.apiEsqui.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Short> {
}