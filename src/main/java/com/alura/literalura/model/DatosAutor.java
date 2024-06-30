package com.alura.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DatosAutor(String nombre, String fechaDeNacimiento, String fechaDeFallecimiento) {
    public DatosAutor(
            @JsonAlias({"name"}) String nombre,
            @JsonAlias({"birth_year"}) String fechaDeNacimiento,
            @JsonAlias({"death_year"}) String fechaDeFallecimiento)
    {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.fechaDeFallecimiento = fechaDeFallecimiento;
    }

    @JsonAlias({"name"})
    public String nombre() {
        return this.nombre;
    }

    @JsonAlias({"birth_year"})
    public String fechaDeNacimiento() {
        return this.fechaDeNacimiento;
    }

    @JsonAlias({"death_year"})
    public String fechaDeFallecimiento() {
        return this.fechaDeFallecimiento;
    }
}