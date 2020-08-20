/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restful.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tefit
 */
@Entity
@Table(name = "Peliculas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Peliculas.findAll", query = "SELECT p FROM Peliculas p")
    , @NamedQuery(name = "Peliculas.findById", query = "SELECT p FROM Peliculas p WHERE p.id = :id")
    , @NamedQuery(name = "Peliculas.findByTitulo", query = "SELECT p FROM Peliculas p WHERE p.titulo = :titulo")
    , @NamedQuery(name = "Peliculas.findByGenero", query = "SELECT p FROM Peliculas p WHERE p.genero = :genero")
    , @NamedQuery(name = "Peliculas.findByIdioma", query = "SELECT p FROM Peliculas p WHERE p.idioma = :idioma")
    , @NamedQuery(name = "Peliculas.findByDuracion", query = "SELECT p FROM Peliculas p WHERE p.duracion = :duracion")
    , @NamedQuery(name = "Peliculas.findByCalificacion", query = "SELECT p FROM Peliculas p WHERE p.calificacion = :calificacion")
    , @NamedQuery(name = "Peliculas.findByResumen", query = "SELECT p FROM Peliculas p WHERE p.resumen = :resumen")
    , @NamedQuery(name = "Peliculas.findByAnioProduccion", query = "SELECT p FROM Peliculas p WHERE p.anioProduccion = :anioProduccion")
    , @NamedQuery(name = "Peliculas.findByFormato", query = "SELECT p FROM Peliculas p WHERE p.formato = :formato")
    , @NamedQuery(name = "Peliculas.findByDirector", query = "SELECT p FROM Peliculas p WHERE p.director = :director")
    , @NamedQuery(name = "Peliculas.findByClasificacion", query = "SELECT p FROM Peliculas p WHERE p.clasificacion = :clasificacion")})
public class Peliculas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Titulo")
    private String titulo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Genero")
    private String genero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Idioma")
    private String idioma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Duracion")
    private String duracion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Calificacion")
    private int calificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "Resumen")
    private String resumen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "anio_produccion")
    private int anioProduccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "formato")
    private String formato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "director")
    private String director;
    @Basic(optional = false)
    @NotNull
    @Column(name = "clasificacion")
    private int clasificacion;

    public Peliculas() {
    }

    public Peliculas(Integer id) {
        this.id = id;
    }

    public Peliculas(Integer id, String titulo, String genero, String idioma, String duracion, int calificacion, String resumen, int anioProduccion, String formato, String director, int clasificacion) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.idioma = idioma;
        this.duracion = duracion;
        this.calificacion = calificacion;
        this.resumen = resumen;
        this.anioProduccion = anioProduccion;
        this.formato = formato;
        this.director = director;
        this.clasificacion = clasificacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public int getAnioProduccion() {
        return anioProduccion;
    }

    public void setAnioProduccion(int anioProduccion) {
        this.anioProduccion = anioProduccion;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Peliculas)) {
            return false;
        }
        Peliculas other = (Peliculas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.restful.entidades.Peliculas[ id=" + id + " ]";
    }
    
}
