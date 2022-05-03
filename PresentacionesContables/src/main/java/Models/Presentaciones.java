/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Models.Tipos.TipoDocumentacion;
import java.sql.Timestamp;
import javax.persistence.*;

/**
 *
 * @author rsilvente
 */
@Entity
@Table(name="convocatorias")
public class Presentaciones {

    /**
     * Constructor de la clase Presentaciones.
     * @param FechaPresentacion Fecha en la cual se realiza la presentación.
     * @param tipoDocumentacion {@link Models.Tipos.TipoDocumentacion}
     * @param usuarios {@link Models.Usuarios}
     */
    public Presentaciones(Timestamp FechaPresentacion, TipoDocumentacion tipoDocumentacion, Usuarios usuarios) {
        this.FechaPresentacion = FechaPresentacion;
        this.tipoDocumentacion = tipoDocumentacion;
        this.usuarios = usuarios;
    }
    
    public Presentaciones() {
    }

    public int getId() {
        return Id;
    }

    public Timestamp getFechaPresentacion() {
        return FechaPresentacion;
    }

    public void setFechaPresentacion(Timestamp FechaPresentacion) {
        this.FechaPresentacion = FechaPresentacion;
    }

    public TipoDocumentacion getTipoDocumentacion() {
        return tipoDocumentacion;
    }

    public void setTipoDocumentacion(TipoDocumentacion tipoDocumentacion) {
        this.tipoDocumentacion = tipoDocumentacion;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "Presentaciones{" + "Id=" + Id + ", FechaPresentacion=" + FechaPresentacion + ", tipoDocumentacion=" + tipoDocumentacion + ", usuarios=" + usuarios + '}';
    }
    
    
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Id")
    private int Id;
    
    @Column(name="fecha_presentacion")
    private Timestamp FechaPresentacion;
    
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="id")
    private TipoDocumentacion tipoDocumentacion;
    
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="id")
    private Usuarios usuarios;
}
