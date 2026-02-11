package com.salesianostriana.edu.tribici.Model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

@Setter
@Getter
@ToString
@Builder
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

    @ManyToOne
    @JoinColumn(name = "bicicleta_id_bici")
    private Bicicleta bicicleta;


    @ManyToOne
    @JoinColumn(name = "inicio_id_estacion")
    private Estacion inicio;

    @ManyToOne
    @JoinColumn(name = "fin_id_estacion")
    private Estacion fin;


    @ManyToOne
    @JoinColumn(name = "usuario_id_usuario")
    private Usuario usuario;

    public double calcularPrecio(LocalDateTime fin) {
        long duracion = ChronoUnit.MINUTES.between(fechaInicio, fechaFin);
        double precio;
        long calculo = duracion;

        calculo = calculo -30;

        if(calculo > 60) {
            precio = (calculo - 60) * 0.025 + 60*0.015;
        } else {
            precio = calculo * 0.015;
        }

    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Uso uso = (Uso) o;
        return getId() != null && Objects.equals(getId(), uso.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
