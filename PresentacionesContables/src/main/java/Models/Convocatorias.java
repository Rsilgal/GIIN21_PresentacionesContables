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
@Table(name="convocatoria")
public class Convocatorias {
    
    /**
     * Constructor de la clase Convocatoria
     * @param Nombre Nombre de la Convocatoria.
     * @param FechaApertura Fecha en la que se abrirá la Convocatoria (Timestamp)
     * @param FechaCierre Fecha de cierre de la Convocatoria (Timestamp)
     * @param EstadoApertura Estado de la Convocatoria (True Or False)
     * @param Documentacion {@link Models.Tipos.TipoDocumentacion}
     */
    public Convocatorias(String Nombre, Timestamp FechaApertura, Timestamp FechaCierre, boolean EstadoApertura, TipoDocumentacion Documentacion) {
        this.Nombre = Nombre;
        this.FechaApertura = FechaApertura;
        this.FechaCierre = FechaCierre;
        this.EstadoApertura = EstadoApertura;
        this.Documentacion = Documentacion;
    }
    
    public Convocatorias() {
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

    public Timestamp getFechaApertura() {
        return FechaApertura;
    }

    public void setFechaApertura(Timestamp FechaApertura) {
        this.FechaApertura = FechaApertura;
    }

    public Timestamp getFechaCierre() {
        return FechaCierre;
    }

    public void setFechaCierre(Timestamp FechaCierre) {
        this.FechaCierre = FechaCierre;
    }

    public boolean isEstadoApertura() {
        return EstadoApertura;
    }

    public void setEstadoApertura(boolean EstadoApertura) {
        this.EstadoApertura = EstadoApertura;
    }

    public TipoDocumentacion getDocumentacion() {
        return Documentacion;
    }

    public void setDocumentacion(TipoDocumentacion Documentacion) {
        this.Documentacion = Documentacion;
    }

    @Override
    public String toString() {
        return "Convocatorias{" + "Id=" + Id + ", Nombre=" + Nombre + ", FechaApertura=" + FechaApertura + ", FechaCierre=" + FechaCierre + ", EstadoApertura=" + EstadoApertura + ", Documentacion=" + Documentacion + '}';
    }
    
    
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Id")
    private int Id;
    
    @Column(name="Nombre")
    private String Nombre;
    
    @Column(name="Fecha_Apertura")
    private Timestamp FechaApertura;
    
    @Column(name="Fecha_Cierre")
    private Timestamp FechaCierre;
    
    @Column(name="Estado_Apertura")
    private boolean EstadoApertura;
    
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="Id")
    private TipoDocumentacion Documentacion;
}
