/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.UUID;

/**
 *
 * @author rsilvente
 */
public abstract class ObjetoBase {
    private String Id;
    
    public ObjetoBase() {
        this.Id = UUID.randomUUID().toString();
    }
}
