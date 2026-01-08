package com.salesianostriana.edu.tribici.Model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Estacion")
public class Estacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idEstacion", nullable = false)
    private Long id;

    @Column(nullable = false)
    private int numero;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String coordenadas;
    @Column(nullable = false)
    private int capacidad;

    @OneToMany()
    @JoinColumn(name = "parkingID")
    private List<Bicicleta> bicicletas;

    @OneToMany()
    private Uso uso;

}
