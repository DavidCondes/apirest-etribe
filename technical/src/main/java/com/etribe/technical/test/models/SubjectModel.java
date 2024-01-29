package com.etribe.technical.test.models;
import com.sun.istack.NotNull;

import javax.persistence.*;


@Entity
@Table(name = "materias")
public class SubjectModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Long id;

    @NotNull
    private String nombre;

    @NotNull
    private Integer creditos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCreditos() {return creditos;}

    public void setCreditos(Integer creditos) {this.creditos = creditos;}
}
