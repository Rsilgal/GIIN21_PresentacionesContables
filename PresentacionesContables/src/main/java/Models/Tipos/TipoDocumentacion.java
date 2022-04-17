/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Tipos;

import javax.persistence.*;

/**
 *
 * @author rsilvente
 */
@Entity
@Table(name="documentacion")
public class TipoDocumentacion {

    public TipoDocumentacion(String Nombre, String Descripcion) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }
    
    public TipoDocumentacion() {
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

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        return "TipoDocumentacion{" + "Id=" + Id + ", Nombre=" + Nombre + ", Descripcion=" + Descripcion + '}';
    }
    
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Id")
    private int Id;
    
    @Column(name="Nombre")
    private String Nombre;
    
    @Column(name="Descripcion")
    private String Descripcion;
}
