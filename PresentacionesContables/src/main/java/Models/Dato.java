/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author rsilvente
 */
public abstract class Dato extends ObjetoBase {
    private String Nombre;
    
    public Dato(String Nombre) {
        super();
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }
    
}
