package com.aluracursos.Challenge.Literalura.Libreria;

import com.aluracursos.Challenge.Literalura.models.Autor;

import java.util.List;
import java.util.Optional;

public interface iAutorRepository {
    List<Autor> findAll();


    List<Autor> findByCumpleaniosLessThanOrFechaFallecimientoGreaterThanEqual(int anioBuscado, int anioBuscado1);

    Optional<Autor> findFirstByNombreContainsIgnoreCase(String escritor);
}
