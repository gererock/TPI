/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Geremias Rocchietti
 */
public class Campeonato {
    private String nombreCampeonatoMundial;
    private int añoCampeonatoMundial;
    private String estadoCampeonatoMundial;

    public Campeonato(String nombreCampeonatoMundial, int añoCampeonatoMundial, String estadoCampeonatoMundial) {
        this.nombreCampeonatoMundial = nombreCampeonatoMundial;
        this.añoCampeonatoMundial = añoCampeonatoMundial;
        this.estadoCampeonatoMundial = estadoCampeonatoMundial;
    }

    public String getNombreCampeonatoMundial() {
        return nombreCampeonatoMundial;
    }

    public void setNombreCampeonatoMundial(String nombreCampeonatoMundial) {
        this.nombreCampeonatoMundial = nombreCampeonatoMundial;
    }

    public int getAñoCampeonatoMundial() {
        return añoCampeonatoMundial;
    }

    public void setAñoCampeonatoMundial(int añoCampeonatoMundial) {
        this.añoCampeonatoMundial = añoCampeonatoMundial;
    }

    public String getEstadoCampeonatoMundial() {
        return estadoCampeonatoMundial;
    }

    public void setEstadoCampeonatoMundial(String estadoCampeonatoMundial) {
        this.estadoCampeonatoMundial = estadoCampeonatoMundial;
    }

    @Override
    public String toString() {
        return "Campeonato{" + "nombreCampeonatoMundial=" + nombreCampeonatoMundial + ", a\u00f1oCampeonatoMundial=" + añoCampeonatoMundial + ", estadoCampeonatoMundial=" + estadoCampeonatoMundial + '}';
    }
    
    
}
