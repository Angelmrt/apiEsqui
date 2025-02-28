package com.azarquiel.s2daw.apiEsqui.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "USUARIO")
public class Usuario {
    @Id
    @SequenceGenerator(name = "USUARIO_id_gen", sequenceName = "SEQ_USUARIO", allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private Short id;

    @Column(name = "NICK", length = 64)
    private String nick;

    @Column(name = "PASS", length = 64)
    private String pass;

    @OneToMany(mappedBy = "usuario")
    private Set<Comentario> comentarios = new LinkedHashSet<>();

}