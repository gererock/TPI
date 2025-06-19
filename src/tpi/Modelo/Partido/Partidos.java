/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpi.Modelo.Partido;

import tpi.Modelo.Estadios.Estadios;



/**
 *
 * @author Geremias Rocchietti
 */
public class Partidos extends Estadios{
    private String fechaPartido;
    private String tipoPartido;
    private String EstadoPartido;

    public Partidos(String fechaPartido, String tipoPartido, String EstadoPartido, String nombreEstadio, String ubicacionEstadio) {
        super(nombreEstadio, ubicacionEstadio);
        this.fechaPartido = fechaPartido;
        this.tipoPartido = tipoPartido;
        this.EstadoPartido = EstadoPartido;
    }

    public String getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(String fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    public String getTipoPartido() {
        return tipoPartido;
    }

    public void setTipoPartido(String tipoPartido) {
        this.tipoPartido = tipoPartido;
    }

    public String getEstadoPartido() {
        return EstadoPartido;
    }

    public void setEstadoPartido(String EstadoPartido) {
        this.EstadoPartido = EstadoPartido;
    }

    @Override
    public String getNombreEstadio() {
        return nombreEstadio;
    }

    @Override
    public void setNombreEstadio(String nombreEstadio) {
        this.nombreEstadio = nombreEstadio;
    }

    @Override
    public String getUbicacionEstadio() {
        return ubicacionEstadio;
    }

    @Override
    public void setUbicacionEstadio(String ubicacionEstadio) {
        this.ubicacionEstadio = ubicacionEstadio;
    }

    @Override
    public String toString() {
        return "Partidos{" + "fechaPartido=" + fechaPartido + ", tipoPartido=" + tipoPartido + ", EstadoPartido=" + EstadoPartido + '}';
    }
    
    
    
    
}
