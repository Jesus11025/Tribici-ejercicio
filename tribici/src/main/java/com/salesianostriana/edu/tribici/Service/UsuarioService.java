package com.salesianostriana.edu.tribici.Service;

import com.salesianostriana.edu.tribici.Model.Usuario;
import com.salesianostriana.edu.tribici.Repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public Optional<Usuario> autenticacion(String numTarjeta, String pin) {
        return Optional.ofNullable(usuarioRepository.findByNumTarjetaAndPin(numTarjeta, pin));
    }
}
