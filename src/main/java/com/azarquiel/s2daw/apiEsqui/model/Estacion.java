package com.azarquiel.s2daw.apiEsqui.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.LinkedHashSet;
import java.util.Set;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ESTACION")
public class Estacion {
    @Id
    @Column(name = "ID", nullable = false)
    private Short id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "LOGO")
    private String logo;

    @Column(name = "PLANO")
    private String plano;

    @Column(name = "KM")
    private Short km;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "PROVINCIA")
    private Provincia provincia;

    @OneToMany(mappedBy = "estacion")
    private Set<Comentario> comentarios = new LinkedHashSet<>();

    @OneToMany(mappedBy = "estacion")
    private Set<Imagen> imagens = new LinkedHashSet<>();

}