/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpi.Modelo.Arbitro;

/**
 *
 * @author Geremias Rocchietti
 */
public class Arbitro {
    private String nombreArbitro;
    private int idArbitro;

    public Arbitro() {
    }

    public Arbitro(String nombreArbitro, int idArbitro) {
        this.nombreArbitro = nombreArbitro;
        this.idArbitro = idArbitro;
    }

    public String getNombreArbitro() {
        return nombreArbitro;
    }

    public void setNombreArbitro(String nombreArbitro) {
        this.nombreArbitro = nombreArbitro;
    }

    public int getIdArbitro() {
        return idArbitro;
    }

    public void setIdArbitro(int idArbitro) {
        this.idArbitro = idArbitro;
    }

    @Override
    public String toString() {
        return "Arbitro{" + "nombreArbitro=" + nombreArbitro + ", idArbitro=" + idArbitro + '}';
    }
    
    
}
