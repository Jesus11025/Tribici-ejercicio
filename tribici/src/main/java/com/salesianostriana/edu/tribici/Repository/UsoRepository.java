package com.salesianostriana.edu.tribici.Repository;

import com.salesianostriana.edu.tribici.Model.Uso;
import com.salesianostriana.edu.tribici.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UsoRepository extends JpaRepository<Uso, Long> {


    @Query("""
            select u 
            from Uso u 
            where u.usuario = ?1
                and u.fechaFin is null
            order by u.fechaInicio DESC""")
    Optional<Uso> findByUsuarioOrderByFechaInicioDesc(Usuario usuario);
}
