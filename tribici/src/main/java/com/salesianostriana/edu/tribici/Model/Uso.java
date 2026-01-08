package com.salesianostriana.edu.tribici.Model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Uso")
public class Uso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idUso", nullable = false)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime fechaInicio;
    @Column(nullable = false)
    private LocalDateTime fechaFin;
    @Column(nullable = false)
    private double coste;

    @ManyToOne()
    private Bicicleta bicicleta;

    @ManyToOne()
    @JoinColumn(name = "usoEstacionID")
    private Estacion estacion;

    @ManyToOne()
    @JoinColumn(name = "usosUsuarioID")
    private Usuario usuario;
}
