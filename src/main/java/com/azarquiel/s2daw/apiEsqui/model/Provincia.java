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
@Table(name = "PROVINCIA")
public class Provincia {
    @Id
    @Column(name = "ID", nullable = false)
    private Short id;

    @Column(name = "NOMBRE")
    private String nombre;

    @OneToMany(mappedBy = "provincia")
    private Set<Estacion> estacions = new LinkedHashSet<>();

}