package com.salesianostriana.edu.tribici.Repository;

import com.salesianostriana.edu.tribici.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
