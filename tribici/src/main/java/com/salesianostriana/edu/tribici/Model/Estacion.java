package com.salesianostriana.edu.tribici.Model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Setter
@Getter
@ToString
@Builder
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

    @Builder.Default
    @OneToMany(mappedBy = "estacion")
    private List<Bicicleta> bicicletas = new ArrayList<>();

    public void addBicicleta(Bicicleta bicicleta) {
        bicicletas.add(bicicleta);
        bicicleta.setEstacion(this);
    }

    public void removeBicicleta(Bicicleta bicicleta) {
        bicicletas.remove(bicicleta);
        bicicleta.setEstacion(null);
    }

    @OneToMany()
    private List<Uso> uso;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Estacion estacion = (Estacion) o;
        return getId() != null && Objects.equals(getId(), estacion.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
