package com.salesianostriana.edu.tribici.Model;

import com.salesianostriana.edu.tribici.Enum.EstadoBicis;
import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Bicileta")
public class Bicicleta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idBici", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String marca;
    @Column(nullable = false)
    private String modelo;
    @Column(nullable = false)
    private EstadoBicis estadoBicis;

    @ManyToOne()
    private Estacion estacion;

    @OneToMany()
    @JoinColumn(name = "usoBiciID")
    private Uso uso;

}
