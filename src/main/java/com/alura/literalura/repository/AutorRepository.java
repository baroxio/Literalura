package com.alura.literalura.repository;

import java.util.List;
import java.util.Optional;

import com.alura.literalura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    Optional<Autor> findByNombre(String nombre);

    @Query("SELECT a FROM Autor a WHERE a.fechaDeNacimiento <= :año AND a.fechaDeFallecimiento >= :año")
    List<Autor> autoresVivosEnDeterminadoAño(int año);
}