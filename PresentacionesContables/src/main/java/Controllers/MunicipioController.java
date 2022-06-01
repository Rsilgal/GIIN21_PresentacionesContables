/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Municipios;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramon
 */
public class MunicipioController {
    
    private static MunicipioController myController;
    
    private List<Municipios> municipios;
    private MunicipiosDAO dao;
    
    public static MunicipioController getMunicipioController() {
        if(myController == null) {
            myController = new MunicipioController();
        }
        return myController;
    }
    
    private MunicipioController() {
        municipios = new ArrayList();
        municipios = dao.getAllElements();
    }
    
    public void crearMunicipio() {
        Municipios municipio = new Municipios();
        municipios.add(municipio);
        dao.addElemet(municipio);
    }
    
    public void eliminarMunicipio(Municipios municipio) {
        dao.delete(municipio);
        municipios.remove(municipio);
    }
    
    public Municipios buscarMunicipio(Municipios municipio) {
        return new Municipios();
    }
    
    public void actualizarMunicipio(Municipios municipio) {
        dao.update(municipio);
        municipios.set(municipios.indexOf(municipio),
                municipio);
    }
}
