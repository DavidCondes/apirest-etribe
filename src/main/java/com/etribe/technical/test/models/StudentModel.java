package com.etribe.technical.test.models;


import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "alumnos")
public class StudentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Long id;

    @NotNull
    private String nombre;

    @NotNull
    private String apellido;

    @NotNull
    private String correo;

    @NotNull
    private Integer edad;

    @NotNull
    private String telefono;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "alumnos_materias",
            joinColumns = @JoinColumn(name = "estudiante_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "materia_id", referencedColumnName = "id")
    )
    private Set<SubjectModel> materias = new HashSet<SubjectModel>();

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Set<SubjectModel> getMaterias() {
        return materias;
    }

    public void setMaterias(Set<SubjectModel> materias) {
        this.materias = materias;
    }
}
