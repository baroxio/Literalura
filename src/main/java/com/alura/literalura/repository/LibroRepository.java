package com.alura.literalura.repository;

import java.util.List;
import java.util.Optional;

import com.alura.literalura.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
    Optional<Libro> findByTituloContainsIgnoreCase(String titulo);

    List<Libro> findByIdioma(String idioma);
}