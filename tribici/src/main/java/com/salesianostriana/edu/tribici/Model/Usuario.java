package com.salesianostriana.edu.tribici.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idUsuario", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String numTarjeta;
    @Column(nullable = false)
    private String pin;
    @Column(nullable = false)
    private double saldo;

    @OneToMany()
    private List<Uso> uso;

}
