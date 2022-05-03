/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Models.Tipos.TipoMunicipio;
import javax.persistence.*;

/**
 *
 * @author rsilvente
 */
@Entity
@Table(name="municipios")
public class Municipios {

    /**
     * Constructor de la clase Municipios
     * @param Nombre Nombre del Municipio
     * @param TipoMunicipio {@link Models.Tipos.TipoUsuario}
     * @param Usuario {@link  Models.Usuarios}
     */
    public Municipios(String Nombre, TipoMunicipio TipoMunicipio, Usuarios Usuario) {
        this.Nombre = Nombre;
        this.TipoMunicipio = TipoMunicipio;
        this.Usuario = Usuario;
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

    public Usuarios getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuarios Usuario) {
        this.Usuario = Usuario;
    }

    @Override
    public String toString() {
        return "Municipios{" + "Id=" + Id + ", Nombre=" + Nombre + ", TipoMunicipio=" + TipoMunicipio + ", Usuario=" + Usuario + '}';
    }
    
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Id")
    private int Id;
    
    @Column(name="Nombre")
    private String Nombre;
    
    @ManyToOne(cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name="Id")
    private TipoMunicipio TipoMunicipio;
    
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="Id")
    private Usuarios Usuario;
}
