package com.salesianostriana.edu.tribici.Service;

import com.salesianostriana.edu.tribici.Model.Bicicleta;
import com.salesianostriana.edu.tribici.Model.Estacion;
import com.salesianostriana.edu.tribici.Model.Uso;
import com.salesianostriana.edu.tribici.Model.Usuario;
import com.salesianostriana.edu.tribici.Repository.BicicletaRepository;
import com.salesianostriana.edu.tribici.Repository.EstacionRepository;
import com.salesianostriana.edu.tribici.Repository.UsoRepository;
import com.salesianostriana.edu.tribici.Repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsoService {

    private static final double UMBRAL_SALDO_MINIMO = 0.10;

    private final UsoRepository usoRepository;
    private final BicicletaRepository bicicletaRepository;
    private final UsuarioRepository usuarioRepository;
    private final UsuarioService usuarioService;
    private final EstacionRepository estacionRepository;

    public Uso inicializarUso(Long idEstacion, String pin, String numTarjeta, Long idBicicleta) {
        Usuario usuario = usuarioService.autenticacion(numTarjeta, pin)
                .orElseThrow(() -> new IllegalArgumentException("Credenciales inválidas"));

        if(usuario.getSaldo() < UMBRAL_SALDO_MINIMO) {
            throw new IllegalArgumentException("Saldo insuficiente para iniciar el uso de la bicicleta");
        }

        Estacion estacion = estacionRepository.findById(idEstacion)
                .orElseThrow(() -> new IllegalArgumentException("Estación no encontrada"));

        Bicicleta bicicleta = bicicletaRepository.findById(idBicicleta)
                .orElseThrow(() -> new IllegalArgumentException("Bicicleta no encontrada"));


    }

    public Uso finalizarUso(String numtarjeta,String pin) {
        Usuario usuario = usuarioService.autenticacion(numtarjeta, pin)
                .orElseThrow(() -> new IllegalArgumentException("Credenciales inválidas"));

        Uso uso = usoRepository.findByUsuarioOrderByFechaInicioDesc(usuario)
                .orElseThrow(() -> new IllegalArgumentException("No hay un uso activo para este usuario"));

        if(idBicicleta != uso.getBicicleta().getId())
    }

}
