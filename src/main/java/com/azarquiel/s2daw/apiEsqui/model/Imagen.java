package com.azarquiel.s2daw.apiEsqui.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "IMAGEN")
public class Imagen {
    @Id
    @Column(name = "ID", nullable = false)
    private Short id;

    @Column(name = "FOTO")
    private String foto;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "ESTACION")
    private Estacion estacion;

}