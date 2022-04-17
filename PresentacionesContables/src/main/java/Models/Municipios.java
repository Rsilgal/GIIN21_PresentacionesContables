/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import javax.persistence.*;

/**
 *
 * @author rsilvente
 */
@Entity
@Table(name="municipios")
public class Municipios {

    public Municipios(String Nombre, TipoMunicipio TipoMunicipio) {
        this.Nombre = Nombre;
        this.TipoMunicipio = TipoMunicipio;
    }

    public Municipios() {
    }

    public int getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public TipoMunicipio getTipoMunicipio() {
        return TipoMunicipio;
    }

    public void setTipoMunicipio(TipoMunicipio TipoMunicipio) {
        this.TipoMunicipio = TipoMunicipio;
    }
    
    
    
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Id")
    private int Id;
    
    @Column(name="Nombre")
    private String Nombre;
    
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="Id")
    private TipoMunicipio TipoMunicipio;
    
    
}
